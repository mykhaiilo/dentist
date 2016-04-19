package org.dentist.dentist.controller;

import org.dentist.dentist.domain.Dentist;
import org.dentist.dentist.service.DatabaseConnectorDentist;
import org.dentist.user.domain.User;
import org.dentist.user.service.DatabaseConnectorUser;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@Controller
public class DentistController {

/*    @RequestMapping("/")
    public Dentist home() {

        Dentist dentist = new Dentist();
        dentist.setAdressDentist("address");
//        String fileName = "src/main/resources/context.xml";
//        ApplicationContext context = new FileSystemXmlApplicationContext(fileName);
//        User user = (User) context.getBean("user");
//        user.setNicknameUser("alec");
//        System.out.println(user.getNicknameUser());
//
//        DatabaseConnectorUser databaseConnector = new DatabaseConnectorUser();
//        databaseConnector.printDatabase();
//        DatabaseConnectorDentist databaseConnectorDentist= new DatabaseConnectorDentist();
//        databaseConnectorDentist.printDatabaseDentist();

        return dentist;
    }*/

    @RequestMapping("/dentisr")
    @ResponseBody
    private static final Logger LOGGER = LoggerFactory.getLogger(DentistController.class);




}
