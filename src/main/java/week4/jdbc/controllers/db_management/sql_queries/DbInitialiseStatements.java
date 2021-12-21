package week4.jdbc.controllers.db_management.sql_queries;

import week4.jdbc.config.Config;

public interface DbInitialiseStatements {
    String DB_INITIALISE = "CREATE DATABASE IF NOT EXISTS " + Config.dbName();
    String CREATE_EMPLOYEES_TABLE = "CREATE TABLE IF NOT EXISTS employees (" +
            "employeeID INTEGER, " +
            "first_name VARCHAR(20), " +
            "last_name VARCHAR(20))";
}
