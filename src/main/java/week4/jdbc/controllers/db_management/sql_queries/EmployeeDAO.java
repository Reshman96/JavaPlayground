package week4.jdbc.controllers.db_management.sql_queries;

import week4.jdbc.controllers.db_management.ConnectionManager;
import week4.jdbc.models.Employee;

import java.sql.*;

public class EmployeeDAO {

    Employee janeDoe = new Employee(1, "jane", "doe");
    Employee johnDoe = new Employee(2, "john", "doe");

    public static void addEmployee(int employeeId, String firstName, String lastName) {
        Employee employee = new Employee(employeeId, firstName, lastName);
        try {
            Connection connection = ConnectionManager.dbCompanyXConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("INSERT INTO employees " + employee.getEmployeeId() + ", " + employee.getFirstName() + ", " + employee.getLastName() + ")");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addEmployeePreparedStatement(int employeeId, String firstName, String lastName) {
        try {
            PreparedStatement employeePreparedStatement = ConnectionManager.dbCompanyXConnection().prepareStatement(EmployeeSQL.ADD_EMPLOYEE);
            employeePreparedStatement.setInt(1, employeeId);
            employeePreparedStatement.setString(2, firstName);
            employeePreparedStatement.setString(3, lastName);
            employeePreparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void getAllEmployees() {

        try {
            ResultSet resultSet = ConnectionManager.dbCompanyXConnection().createStatement().executeQuery(EmployeeSQL.GET_ALL_EMPLOYEES);

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        EmployeeDAO.addEmployeePreparedStatement(2, "John", "Doe");
        EmployeeDAO.getAllEmployees();
    }
}
