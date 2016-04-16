package org.dentist.config;

import org.dentist.dentist.domain.Dentist;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class dentistConfig {
    @Bean
    public Dentist dentist(){
        Dentist dentist = new Dentist();
        return dentist;
    }

}
