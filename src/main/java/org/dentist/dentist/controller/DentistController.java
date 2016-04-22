package org.dentist.dentist.controller;

import org.dentist.dentist.domain.Dentist;
import org.dentist.search.service.DentistSearchImpl;
import org.dentist.web.util.HeaderUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/dentist")
@RestController
public class DentistController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DentistController.class);
    private Dentist dentist = new Dentist();
    @Autowired
    private DentistSearchImpl dentistSearch;

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Dentist>> getAllDentists() {
        return ResponseEntity.ok(dentistSearch.getAll());
    }

    @RequestMapping(
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> addDentist(@RequestBody Dentist dentist) {
        if (dentistSearch.findByNickname(dentist.getNicknameDentist()) != null) {
            LOGGER.warn("Dentist '{}' already in use!", dentist.getNicknameDentist());
            return ResponseEntity.badRequest()
                    .headers(HeaderUtil.createFailureAlert("dentist-management", "dentistExists", "Nickname already in use"))
                    .body(null);
        } else {
            dentist.getDentists().add(dentist);
            LOGGER.info("Dentist '{}' has been added", dentist.getNicknameDentist());
            return ResponseEntity.ok().build();
        }
    }

    @RequestMapping(
            method = RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Dentist> updateDentist(@RequestBody Dentist dentist) {
        Dentist existingDentist = dentistSearch.findByNickname(dentist.getNicknameDentist());
        if (existingDentist != null && !existingDentist.getNicknameDentist().equals(dentist.getNicknameDentist())) {
            return ResponseEntity.badRequest()
                    .headers(HeaderUtil.createFailureAlert("dentist-management", "nicknameExists", "Nickname already in use"))
                    .body(null);
        }
        this.dentist.getDentists().add(dentist);
        return ResponseEntity.ok()
                .headers(HeaderUtil.createEntityUpdateAlert("dentist", dentist.getNicknameDentist()))
                .body(dentistSearch.findByNickname(dentist.getNicknameDentist()));
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> deleteDentist(@RequestParam("nickname") String nickname) {
        Dentist dentist = dentistSearch.findByNickname(nickname);
        if (dentist == null) {
            LOGGER.warn("Dentist 'nickname={}' not found!", nickname);
            return ResponseEntity.badRequest()
                    .headers(HeaderUtil.createFailureAlert("dentist-management", "dentistNotFound", "Dentist not found"))
                    .body(null);
        } else {
            for (int i = 0; i < dentist.getDentists().size(); i++) {
                if (this.dentist.getDentists().get(i).equals(dentist)) {
                    this.dentist.getDentists().remove(i);
                }
            }
            LOGGER.info("Dentist '{}' has been removed.", dentist.getNicknameDentist());
            return ResponseEntity.ok()
                    .headers(HeaderUtil.createAlert("dentist-management.deleted", dentist.getNicknameDentist()))
                    .build();
        }
    }

}
