package org.dentist.config;

import org.dentist.user.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class userConfig {
    @Bean
    public User user(){
        User user =new User();
        return user;
    }
}
