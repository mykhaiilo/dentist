package org.dentist.search.service;

public interface DentistSearch {

    String findByNickname(String nickname);
    String findByService(String service);

}