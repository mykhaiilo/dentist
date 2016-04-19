package org.dentist.user.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseUser {
    private static final Logger logger = LoggerFactory.getLogger(DatabaseUser.class);
    private Connection connection;
    FileInputStream fis;
    Properties property = new Properties();

    public Connection getConnection() {
        return connection;
    }

    public DatabaseUser() {
        try {
            fis = new FileInputStream("/home/michael/IdeaProjects/dentist/src/main/resources/application.properties");
            property.load(fis);
            String URL = property.getProperty("db.URL");
            String USERNAME = property.getProperty("db.USERNAME");
            String PASSWORD = property.getProperty("db.PASSWORD");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            logger.error("You received exception " + e);
        }catch (IOException e) {
            logger.error("Error file not found");
    }
}
}
