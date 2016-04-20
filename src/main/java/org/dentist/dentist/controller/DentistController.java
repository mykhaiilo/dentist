package org.dentist.dentist.controller;

import org.dentist.dentist.domain.Dentist;
import org.dentist.dentist.service.DatabaseConnectorDentist;
import org.dentist.dentist.service.DentistService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/dentist")
@ResponseBody
@Controller
public class DentistController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DentistController.class);
    @Autowired
    @Qualifier("dentistService")
    private DentistService dentistService;

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Dentist>> getAllDentists() {
        return ResponseEntity.ok(dentistService.getAll());
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public void getMyDatabase() {
        DatabaseConnectorDentist databaseConnectorDentist = new DatabaseConnectorDentist();
        databaseConnectorDentist.printDatabaseDentist();
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public DatabaseConnectorDentist putMyDatabase(@RequestBody DatabaseConnectorDentist databaseConnectorDentist) {
        return databaseConnectorDentist;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public void postMyDatabase() {
        DatabaseConnectorDentist databaseConnectorDentist = new DatabaseConnectorDentist();
        databaseConnectorDentist.printDatabaseDentist();
    }

    @RequestMapping( method = RequestMethod.DELETE)
    @ResponseBody
    public Dentist deleteMyDatabase(@PathVariable long time) {
        return new Dentist();
    }


}
