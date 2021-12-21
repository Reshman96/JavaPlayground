package week4.jdbc.controllers.db_management;

import week4.jdbc.config.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    public static Connection dbInitialiseConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(Config.dbConnectionUrl(), Config.dbUsername(), Config.dbPassword());
            System.out.println("connected to DB");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static Connection dbCompanyXConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(Config.dbConnectionUrl() + "/" + Config.dbName(), Config.dbUsername(), Config.dbPassword());
            System.out.println("connected to DB");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        try {
            // logger goes here
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ConnectionManager.dbInitialiseConnection();
    }
}
