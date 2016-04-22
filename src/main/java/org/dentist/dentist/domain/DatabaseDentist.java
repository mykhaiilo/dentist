package org.dentist.dentist.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DatabaseDentist {

    private static final Logger logger = LoggerFactory.getLogger(DatabaseDentist.class);
    FileInputStream fis;
    Properties property = new Properties();
    private Connection connection;

    public DatabaseDentist() {
        try {
            fis = new FileInputStream("/home/michael/IdeaProjects/dentist/src/main/resources/application.properties");
            property.load(fis);
            String URL = property.getProperty("db.URL");
            String USERNAME = property.getProperty("db.USERNAME");
            String PASSWORD = property.getProperty("db.PASSWORD");

            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            logger.error("You received SQLException exception " + e);
        } catch (IOException e) {
            logger.error("Error file not found");
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
