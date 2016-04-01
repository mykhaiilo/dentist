package org.dentist.search.service;

import org.dentist.user.domain.User;

public class UserSearchImpl implements UserSearch {
    private static final String NO_USER_BY_ID = "Did not find any Dentists by this nickname";
    private static final String NO_USER_BY_NICKNAME = "Did not find any Dentists by this service";
    private User user = new User();

    public String findUserByID(int idUser) {
        if (user.getIdUser() == idUser){
            StringBuilder sb = new StringBuilder();
            sb.append("We have found the user with this ID :");
            sb.append(user);
            return sb.toString();
        }
        return NO_USER_BY_ID;
    }

    public String findUserByNickname(String nicknameUser) {
        if (user.getNicknameUser().equals(nicknameUser)){
            StringBuilder sb = new StringBuilder();
            sb.append("We have found the user with this nickname :");
            sb.append(user);
            return sb.toString();
        }
        return NO_USER_BY_NICKNAME;
    }
}
