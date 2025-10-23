package 23_OCT_2025 beans;

import java.io.Serializable;

public class Employee implements Serializable {
    private int empID;
    private String empName;
    private String empRole;

    // No-argument constructor
    public Employee() {
        this.empID = 0;
        this.empName = "Unknown";
        this.empRole = "Employee";
    }

    // Constructor with empID and empName (empRole hardcoded)
    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = "Employee";
    }

    // Constructor with empID, empName, and empRole
    public Employee(int empID, String empName, String empRole) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = empRole;
    }

    // Getters and Setters
    public int getEmpID() {
      return empID; 
    }
    public void setEmpID(int empID) {
      this.empID = empID; 
    }

    public String getEmpName() {
      return empName; 
    }
    public void setEmpName(String empName) {
      this.empName = empName; 
    }

    public String getEmpRole() {
      return empRole; 
    }
    public void setEmpRole(String empRole) {
      this.empRole = empRole; 
    }

    @Override
    public String toString() {
        return "Employee [ID=" + empID + ", Name=" + empName + ", Role=" + empRole + "]";
    }
}
