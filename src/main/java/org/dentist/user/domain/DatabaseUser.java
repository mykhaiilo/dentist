package org.dentist.user.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUser {
    private static final Logger logger = LoggerFactory.getLogger(DatabaseUser.class);
    private final static String URL = "jdbc:mysql://localhost:3306/dentist";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public DatabaseUser() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            logger.error("You received exception " + e);
        }
    }


}
