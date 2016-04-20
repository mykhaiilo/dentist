package org.dentist.dentist.service;

import org.dentist.dentist.domain.Dentist;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("dentistService")
public class DentistServiceImpl implements DentistService {
    @Override
    public List<Dentist> getAll() {
        return null;
    }
}
