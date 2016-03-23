package org.dentist.user.service;

import org.dentist.user.domain.DatabaseWorker;
import org.dentist.user.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnector {
    private static final Logger logger = LoggerFactory.getLogger(DatabaseConnector.class);
    private DatabaseWorker databaseWorker = new DatabaseWorker();
    private ResultSet resultSet = null;
    private PreparedStatement preparedStatement;
    private final static String INSERT_NEW = "INSERT INTO users VALUES (?,?,?,?,?)";
    private final static String GET_ALL = "SELECT * FROM users";

    private void addNewRows(){
        try {
            preparedStatement = databaseWorker.getConnection().prepareStatement(INSERT_NEW);
            preparedStatement.setInt(1, 8);
            preparedStatement.setString(2, "Jonatan");
            preparedStatement.setString(3, "Jonn");
            preparedStatement.setString(4, "jonatan@gmail.com");
            preparedStatement.setString(5, "09566633322");
            preparedStatement.execute();
        } catch (SQLException e) {
            logger.error("You received exception " + e);
        }
    }

    private void checkConnection() {
        try {
            preparedStatement = databaseWorker.getConnection().prepareStatement(GET_ALL);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            logger.error("You received exception " + e);
        }
    }


    public void printDatabase() {
        addNewRows();
        checkConnection();
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    User user = new User();
                    user.setId(resultSet.getInt("id"));
                    user.setName(resultSet.getString("name"));
                    user.setNickname(resultSet.getString("nickname"));
                    user.setEmail(resultSet.getString("email"));
                    user.setPhone(resultSet.getString("phone"));
                    System.out.println(user);
                }
            } catch (SQLException e) {
                logger.error("You received exception " + e);
            } catch (NullPointerException e) {
                logger.error("You received exception " + e);
            }
        }
    }

}
