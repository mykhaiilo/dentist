package org.dentist.config;

import org.dentist.dentist.domain.DatabaseDentist;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class databaseDentistConfig {
    @Bean
    public DatabaseDentist databaseDentist(){
        DatabaseDentist databaseDentist = new DatabaseDentist();
        return databaseDentist;
    }
}
