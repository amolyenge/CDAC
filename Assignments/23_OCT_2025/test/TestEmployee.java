package 23_OCT_2025 test;

import 23_OCT_2025.beans.Employee;
import  23_OCT_2025.service.EmployeeService;
import 23_OCT_2025.service.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeServiceImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Employee Management Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Show All Employees");
            System.out.println("4. Show Employees Sorted by ID");
            System.out.println("5. Find Employee by Name");
            System.out.println("6. Save Employees to File");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Employee Role (or leave blank for default): ");
                    String role = sc.nextLine();
                    if (role.isEmpty()) {
                        service.addEmployee(new Employee(id, name));
                    } else {
                        service.addEmployee(new Employee(id, name, role));
                    }
                    break;

                case 2:
                    System.out.print("Enter Employee ID to remove: ");
                    int removeId = sc.nextInt();
                    service.removeEmployee(removeId);
                    break;

                case 3:
                    System.out.println("All Employees:");
                    for (Employee e : service.getAllEmployees()) {
                        System.out.println(e);
                    }
                    break;

                case 4:
                    System.out.println("Employees Sorted by ID:");
                    for (Employee e : service.getSortedEmployees()) {
                        System.out.println(e);
                    }
                    break;

                case 5:
                    System.out.print("Enter Employee Name to search: ");
                    String searchName = sc.nextLine();
                    Employee emp = service.findEmployeeByName(searchName);
                    if (emp != null) {
                        System.out.println("Found: " + emp);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter filename to save employees: ");
                    String filename = sc.nextLine();
                    service.saveEmployeesToFile(filename);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
