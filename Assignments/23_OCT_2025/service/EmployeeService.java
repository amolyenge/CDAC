package 23_OCT_2025.service;

import beans.Employee;
import java.util.ArrayList;

public interface EmployeeService {
    void addEmployee(Employee emp);
    void removeEmployee(int empID);
    ArrayList<Employee> getAllEmployees();
    ArrayList<Employee> getSortedEmployees();
    Employee findEmployeeByName(String empName);
    void saveEmployeesToFile(String filename);
}
