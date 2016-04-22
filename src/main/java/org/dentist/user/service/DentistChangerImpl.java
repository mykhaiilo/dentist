package org.dentist.user.service;

import org.dentist.dentist.domain.Dentist;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
public class DentistChangerImpl implements DentistChanger {
    private Map<Dentist, Dentist> dentistMap = new HashMap<Dentist, Dentist>();
    private Dentist dentist = new Dentist();

    @Transactional
    public Dentist changeDentist(Dentist dentist) {
        if (dentist.isPermission()) {
            this.dentist = dentist;
            this.dentist.setNicknameDentist("GoodDentist");
            dentistMap.put(dentist, this.dentist);
        }
        return this.dentist;
    }
}
