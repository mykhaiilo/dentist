import org.dentist.dentist.service.DatabaseConnectorDentist;
import org.dentist.user.domain.User;
import org.dentist.user.service.DatabaseConnectorUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
public class Launcher {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
    public static void main(String[] args) {

        String fileName = "src/main/resources/context.xml";
        ApplicationContext context = new FileSystemXmlApplicationContext(fileName);
        User user = (User) context.getBean("user");
        user.setNicknameUser("alec");
        System.out.println(user.getNicknameUser());

        DatabaseConnectorUser databaseConnector = new DatabaseConnectorUser();
        databaseConnector.printDatabase();
        DatabaseConnectorDentist databaseConnectorDentist= new DatabaseConnectorDentist();
        databaseConnectorDentist.printDatabaseDentist();


        SpringApplication.run(Launcher.class, args);
    }
}
