package org.dentist.user.service;

import org.dentist.user.domain.DatabaseWorker;
import org.dentist.user.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnector {
    private static final Logger logger = LoggerFactory.getLogger(DatabaseConnector.class);
    private DatabaseWorker databaseWorker = new DatabaseWorker();
    private ResultSet resultSet;
    private Statement statement;

    private void checkConnection() {
        String query = "select * from users";
        try {
            statement = databaseWorker.getConnection().createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            logger.error("You received exception " + e);
        }
    }

    private void fillDatabase(){
        try {
            statement.execute("INSERT INTO users(id, name, nickname, email, phone)" +
                    "VALUES (5, 'Tom', 'Tom3', 'tom@gmail.com', '0990909900')");
            statement.execute("INSERT INTO users(id, name, nickname, email, phone)" +
                    "VALUES (6, 'Joe', 'Joe2', 'joe@gmail.com', '0887862767')");
            statement.execute("INSERT INTO users(id, name, nickname, email, phone)" +
                    "VALUES (7, 'Oliver', 'Oliver2', 'oliver@gmail.com','0998465488')");
        } catch (SQLException e) {
            logger.error("You received exception " + e);
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                logger.error("You received exception " + e);
            }
        }
    }

    public void printDatabase() {
        checkConnection();
        /*fillDatabase();*/
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
