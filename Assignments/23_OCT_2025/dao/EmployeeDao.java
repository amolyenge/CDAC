package 23_OCT_2025.dao;

import 23_OCT_2025.beans.Employee;
import java.util.ArrayList;

public interface EmployeeDAO {
    void addEmployee(Employee emp);
    void removeEmployee(int empID);
    ArrayList<Employee> getAllEmployees();
    ArrayList<Employee> getSortedEmployees();
    Employee findEmployeeByName(String empName);
    void saveToFile(String filename);
}
