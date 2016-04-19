package org.dentist.dentist.service;
import org.dentist.dentist.domain.DatabaseDentist;
import org.dentist.dentist.domain.Dentist;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@Service
public class DatabaseConnectorDentist {

    @Autowired
    private DataSource dataSource;

    private static final Logger logger = LoggerFactory.getLogger( DatabaseConnectorDentist.class);
    private DatabaseDentist databaseDentist = new  DatabaseDentist();
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private final static String INSERT_NEW = "INSERT INTO dentist VALUES (?,?,?,?,?,?,?,?)";
    private final static String GET_ALL = "SELECT * FROM dentist";

    private void addNewRows() {
        try {
            preparedStatement = databaseDentist.getConnection().prepareStatement(INSERT_NEW);
            preparedStatement.setInt(1, 3);
            preparedStatement.setString(2, "Snit");
            preparedStatement.setString(3, "Caroline");
            preparedStatement.setString(4, "Caroline.com");
            preparedStatement.setInt(5, 6);
            preparedStatement.setString(6, "Shevchenka street 6/25");
            preparedStatement.setString(7, "09562345223");
            preparedStatement.setString(8, "oral exams");
            preparedStatement.execute();
        } catch (SQLException e) {
            logger.error("You received SQLException exception " + e);
        } catch (NullPointerException e) {
            logger.error("You received NullPointerException exception" + e);
        }
    }

    private void checkConnection() {
        try {
            preparedStatement = databaseDentist.getConnection().prepareStatement(GET_ALL);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            logger.error("You received SQLException exception " + e);
        }
    }

    public void printDatabaseDentist() {
        addNewRows();
        checkConnection();
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    Dentist dentist = new Dentist();
                    dentist.setIdDentist(resultSet.getInt("idDentist"));
                    dentist.setNameDentist(resultSet.getString("nameDentist"));
                    dentist.setNicknameDentist(resultSet.getString("nicknameDentist"));
                    dentist.setEmailDentist(resultSet.getString("emailDentist"));
                    dentist.setExperienceDentist(resultSet.getInt("experienceDentist"));
                    dentist.setAdressDentist(resultSet.getString("adressDentist"));
                    dentist.setPhoneDentist(resultSet.getString("phoneDentist"));
                    dentist.setServiceDentist(resultSet.getString("serviceDentist"));
                    System.out.println(dentist);
                }
            } catch (SQLException e) {
                logger.error("You received SQLException exception " + e);
            } catch (NullPointerException e) {
                logger.error("You received NullPointerException exception " + e);
            }
        }
    }
}
