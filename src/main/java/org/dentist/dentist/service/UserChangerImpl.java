package org.dentist.dentist.service;

import org.dentist.user.domain.User;

import java.util.HashMap;
import java.util.Map;

public class UserChangerImpl implements UserChanger{
    private Map<User, User> dentistMap = new HashMap<User, User>();
    private User user = new User();

    public User changeUser(User user) {
        if (user.isPermission()) {
            this.user = user;
            this.user.setNicknameUser("BadUser");
            this.user.setIdUser(123);
            dentistMap.put(user, this.user);
        }
        return this.user;
    }
}
