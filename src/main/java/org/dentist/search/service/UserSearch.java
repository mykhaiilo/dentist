package org.dentist.search.service;

public interface UserSearch {
    public String findUserByID(int idUser);

    public String findUserByNickname(String nicknameUser);
}
