import org.dentist.user.service.DatabaseConnector;

public class Launcher {
    public static void main(String[] args) {
        DatabaseConnector databaseConnector = new DatabaseConnector();
        databaseConnector.printDatabase();
    }
}
