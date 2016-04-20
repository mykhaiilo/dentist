package org.dentist.search.service;

import org.dentist.dentist.domain.Dentist;

public interface DentistSearch {

    String findByNickname(String nickname);
    String findByService(String service);
    Dentist getAll();
}