package com.Inheritance.test;

import java.util.Scanner;

import com.Inheritance.beans.ContractEmployee;
import com.Inheritance.beans.Employee;
import com.Inheritance.beans.SalariedEmployee;
import com.Inheritance.beans.Vendor;
import com.Inheritance.service.ClubService;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClubService service = new ClubService();

        while (true) {
            System.out.println("\n--- XYZ Sports Club Menu ---");
            System.out.println("1. Display Employees by Type");
            System.out.println("2. Search Employee by ID");
            System.out.println("3. Search Employee by Name");
            System.out.println("4. Display All Employees");
            System.out.println("5. Calculate Salary by Designation");
            System.out.println("6. Display 5 Employees by Department");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter type (salaried/contract/vendor): ");
                    String type = sc.nextLine().toLowerCase();
                    Class<?> cls = switch (type) {
                        case "salaried" -> SalariedEmployee.class;
                        case "contract" -> ContractEmployee.class;
                        case "vendor" -> Vendor.class;
                        default -> null;
                    };
                    if (cls != null) {
                        service.getEmployeesByType(cls).forEach(System.out::println);
                    } else {
                        System.out.println("Invalid type.");
                    }
                }
                case 2 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    Employee e = service.searchById(id);
                    System.out.println(e != null ? e : "Not found.");
                }
                case 3 -> {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    service.searchByName(name).forEach(System.out::println);
                }
                case 4 -> {
                	service.getAllEmployees().forEach(System.out::println);
                	}
                case 5 -> {
                    System.out.print("Enter designation: ");
                    String desig = sc.nextLine();
                    service.getEmployeesByDesignation(desig).forEach(emp ->
                        System.out.println(emp + ", Salary: " + emp.calculateSalary()));
                }
                case 6 -> {
                    System.out.print("Enter department: ");
                    String dept = sc.nextLine();
                    service.getEmployeesByDepartment(dept).forEach(System.out::println);
                }
                case 7 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
