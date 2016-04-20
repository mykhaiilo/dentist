import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class Launcher {


//    @RequestMapping("/")
//    @ResponseBody
//    void home() {
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
//    }


    // TODO @mykhaiilo
    // 1. Config file for MySQL - prod profile (javaconfig)
    // 2. configuration file for HSQL - dev profile (default) (javaconfig)
    // 3. all properties should be in property file, i.e. dev-profile.properties



    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
    }
}
