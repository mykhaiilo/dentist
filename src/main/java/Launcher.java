import org.dentist.dentist.service.DatabaseConnectorDentist;
import org.dentist.user.service.DatabaseConnectorUser;

public class Launcher {
    public static void main(String[] args) {
        DatabaseConnectorUser databaseConnector = new DatabaseConnectorUser();
        databaseConnector.printDatabase();
        DatabaseConnectorDentist databaseConnectorDentist= new DatabaseConnectorDentist();
        databaseConnectorDentist.printDatabaseDentist();
    }
}
