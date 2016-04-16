package org.dentist.config;

import org.dentist.user.domain.DatabaseUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class databaseUserConfig {
    @Bean
    public DatabaseUser databaseUser (){
        DatabaseUser databaseUser = new DatabaseUser();
        return databaseUser;

    }
}
