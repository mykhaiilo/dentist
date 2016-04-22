package org.dentist.search.service;

import org.dentist.dentist.domain.Dentist;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistSearchImpl implements DentistSearch {
    private Dentist dentist = new Dentist();

    public Dentist findByNickname(String nickname) {
        for (int i = 0; i < dentist.getDentists().size(); i++) {
            if (this.dentist.getDentists().get(i).getNicknameDentist().equals(nickname)) {
                return this.dentist.getDentists().get(i);
            }
        }
        return null;
    }

    public Dentist findByService(String service) {
        for (int i = 0; i < dentist.getDentists().size(); i++) {
            if (this.dentist.getDentists().get(i).getServiceDentist().equals(service)) {
                return this.dentist.getDentists().get(i);
            }
        }
        return null;
    }

    public List<Dentist> getAll() {
        return dentist.getDentists();
    }
}
