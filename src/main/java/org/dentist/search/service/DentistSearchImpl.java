package org.dentist.search.service;

import org.dentist.dentist.domain.Dentist;
import org.springframework.stereotype.Service;

@Service
public class DentistSearchImpl implements DentistSearch {
    private static final String NO_DENTIST_BY_NICKNAME = "Did not find any Dentists by this nickname";
    private static final String NO_DENTIST_BY_SERVICE = "Did not find any Dentists by this service";
    private Dentist dentist = new Dentist();

    public String findByNickname(String nickname) {
        if (dentist.getNicknameDentist().equals(nickname)){
            StringBuilder sb = new StringBuilder();
            sb.append("We have found the dentist with this nickname :");
            sb.append(dentist);
            return sb.toString();
        }
        return NO_DENTIST_BY_NICKNAME;
    }

    public String findByService(String service) {
        if (dentist.getServiceDentist().equals(service)){
            StringBuilder sb = new StringBuilder();
            sb.append("We have found the dentist with this service :");
            sb.append(dentist);
            return sb.toString();
        }
        return NO_DENTIST_BY_SERVICE;
    }

    @Override
    public Dentist getAll() {
        return dentist;
    }
}
