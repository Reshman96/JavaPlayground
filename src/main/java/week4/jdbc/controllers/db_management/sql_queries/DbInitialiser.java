package week4.jdbc.controllers.db_management.sql_queries;

import week4.jdbc.controllers.db_management.ConnectionManager;

import java.sql.Connection;
import java.sql.SQLException;

public class DbInitialiser {

    public static void initialiseDb() {
        try {
            Connection connection = ConnectionManager.dbInitialiseConnection();
            connection.createStatement().executeUpdate(DbInitialiseStatements.DB_INITIALISE);
            ConnectionManager.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void initialiseEmployeeTable() {
        try {
            Connection connection = ConnectionManager.dbCompanyXConnection();
            connection.createStatement().executeUpdate(DbInitialiseStatements.CREATE_EMPLOYEES_TABLE);
            ConnectionManager.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void initialiseDbFirstInstance() {
        DbInitialiser.initialiseDb();
        DbInitialiser.initialiseEmployeeTable();
    }

    public static void main(String[] args) {
        DbInitialiser.initialiseDbFirstInstance();
    }
}
