package org.dentist.user.controller;

import org.dentist.user.service.DatabaseConnectorUser;
import org.dentist.user.service.DentistChangerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    @Qualifier("DatabaseConnectorUser")
    private DatabaseConnectorUser databaseConnectorUser;

    @Autowired
    @Qualifier("DentistChangerImpl")
    private DentistChangerImpl dentistChanger;


}
