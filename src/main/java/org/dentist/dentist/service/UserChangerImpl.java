package org.dentist.dentist.service;

import org.dentist.user.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserChangerImpl implements UserChanger{
    private Map<User, User> dentistMap = new HashMap<User, User>();
    private User user = new User();

    @Transactional
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
