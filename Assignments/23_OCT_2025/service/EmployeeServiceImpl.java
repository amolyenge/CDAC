package 23_OCT_2025.service;

import 23_OCT_2025.beans.Employee;
import 23_OCT_2025.dao.EmployeeDAO;
import 23_OCT_2025.dao.EmployeeDAOImpl;

import java.util.ArrayList;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO dao;

    public EmployeeServiceImpl() {
        dao = new EmployeeDAOImpl(); 
    }

    @Override
    public void addEmployee(Employee emp) {
        dao.addEmployee(emp);
    }

    @Override
    public void removeEmployee(int empID) {
        dao.removeEmployee(empID);
    }

    @Override
    public ArrayList<Employee> getAllEmployees() {
        return dao.getAllEmployees();
    }

    @Override
    public ArrayList<Employee> getSortedEmployees() {
        return dao.getSortedEmployees();
    }

    @Override
    public Employee findEmployeeByName(String empName) {
        return dao.findEmployeeByName(empName);
    }

    @Override
    public void saveEmployeesToFile(String filename) {
        dao.saveToFile(filename);
    }
}
