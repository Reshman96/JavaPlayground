package week4.jdbc.controllers.db_management.sql_queries;

public interface EmployeeSQL {
    String ADD_EMPLOYEE = "INSERT INTO employees (`employeeID`, `first_name`, `last_name`) VALUES (?,?,?)";
    String GET_ALL_EMPLOYEES = "SELECT * FROM employees";
}
