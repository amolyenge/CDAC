package 23_OCT_2025.dao;

import 23_OCT_2025.beans.Employee;
import java.util.ArrayList;
import java.util.Comparator;
import java.io.*;

public class EmployeeDAOImpl implements EmployeeDAO {
    private ArrayList<Employee> employees;

    public EmployeeDAOImpl() {
        employees = new ArrayList<>();
    }

    @Override
    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee added successfully!");
    }

    @Override
    public void removeEmployee(int empID) {
        employees.removeIf(emp -> emp.getEmpID() == empID);
        System.out.println("Employee removed successfully!");
    }

    @Override
    public ArrayList<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public ArrayList<Employee> getSortedEmployees() {
        ArrayList<Employee> sortedList = new ArrayList<>(employees);
        sortedList.sort(Comparator.comparingInt(Employee::getEmpID));
        return sortedList;
    }

    @Override
    public Employee findEmployeeByName(String empName) {
        for (Employee emp : employees) {
            if (emp.getEmpName().equalsIgnoreCase(empName)) {
                return emp;
            }
        }
        return null;
    }

    @Override
    public void saveToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(employees);
            System.out.println("Employees saved to file successfully!");
        } catch (IOException e) {
            System.out.println("Error saving employees: " + e.getMessage());
        }
    }
}
