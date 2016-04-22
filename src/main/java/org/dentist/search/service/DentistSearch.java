package org.dentist.search.service;

import org.dentist.dentist.domain.Dentist;

import java.util.List;

public interface DentistSearch {

    Dentist findByNickname(String nickname);

    Dentist findByService(String service);

    List<Dentist> getAll();
}