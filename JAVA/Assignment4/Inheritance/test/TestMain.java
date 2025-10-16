package com.Inheritance.test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.Inheritance.beans.CompanyCustomer;
import com.Inheritance.beans.Customer;
import com.Inheritance.beans.IndividualCustomer;
import com.Inheritance.beans.Vendor;
import com.Inheritance.service.TelecomService;
import com.Inheritance.service.TelecomServiceImpl;

public class TestMain {
    public static void main(String[] args) {
        TelecomService service = new TelecomServiceImpl();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- ABCTel Telecom Menu ---");
            System.out.println("1. Add Vendor");
            System.out.println("2. Add Individual Customer");
            System.out.println("3. Add Company Customer");
            System.out.println("4. Delete Vendor");
            System.out.println("5. Delete Customer");
            System.out.println("6. List All Vendors");
            System.out.println("7. List All Customers");
            System.out.println("8. Update Customer Plan");
            System.out.println("9. Update Vendor Products");
            System.out.println("10. View Customer Details");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Vendor ID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Phone Number: ");
                    String phone = sc.nextLine();
                    System.out.print("Products (comma-separated): ");
                    List<String> products = Arrays.asList(sc.nextLine().split(","));
                    Vendor v = new Vendor(id, name, email, phone, products);
                    service.addVendor(v);
                    System.out.println("Vendor added successfully.");
                }
                case 2 -> {
                    System.out.print("Customer ID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Credit Class: ");
                    String creditClass = sc.nextLine();
                    System.out.print("Discount: ");
                    double discount = sc.nextDouble(); sc.nextLine();
                    System.out.print("Plan: ");
                    String plan = sc.nextLine();
                    System.out.print("Phone Number: ");
                    String phone = sc.nextLine();
                    IndividualCustomer ic = new IndividualCustomer(id, name, email, creditClass, discount, plan, phone);
                    service.addCustomer(ic);
                    System.out.println("Individual customer added.");
                }
                case 3 -> {
                    System.out.print("Customer ID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Credit Class: ");
                    String creditClass = sc.nextLine();
                    System.out.print("Discount: ");
                    double discount = sc.nextDouble(); sc.nextLine();
                    System.out.print("Plan: ");
                    String plan = sc.nextLine();
                    System.out.print("Relationship Manager: ");
                    String rm = sc.nextLine();
                    System.out.print("Credit Line: ");
                    double creditLine = sc.nextDouble(); sc.nextLine();
                    System.out.print("Extensions (comma-separated): ");
                    List<String> extensions = Arrays.asList(sc.nextLine().split(","));
                    System.out.print("Numbers (comma-separated): ");
                    List<String> numbers = Arrays.asList(sc.nextLine().split(","));
                    CompanyCustomer cc = new CompanyCustomer(id, name, email, creditClass, discount, plan, rm, creditLine, extensions, numbers);
                    service.addCustomer(cc);
                    System.out.println("Company customer added.");
                }
                case 4 -> {
                    System.out.print("Enter Vendor ID to delete: ");
                    String id = sc.nextLine();
                    service.deleteVendor(id);
                    System.out.println("Vendor deleted.");
                }
                case 5 -> {
                    System.out.print("Enter Customer ID to delete: ");
                    String id = sc.nextLine();
                    service.deleteCustomer(id);
                    System.out.println("Customer deleted.");
                }
                case 6 -> {
                    System.out.println("All Vendors:");
                    service.listVendors().forEach(System.out::println);
                }
                case 7 -> {
                    System.out.println("All Customers:");
                    service.listCustomers().forEach(System.out::println);
                }
                case 8 -> {
                    System.out.print("Enter Customer ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter New Plan: ");
                    String newPlan = sc.nextLine();
                    service.updateCustomerPlan(id, newPlan);
                    System.out.println("Customer plan updated.");
                }
                case 9 -> {
                    System.out.print("Enter Vendor ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter New Products (comma-separated): ");
                    List<String> newProducts = Arrays.asList(sc.nextLine().split(","));
                    service.updateVendorProducts(id, newProducts);
                    System.out.println("Vendor products updated.");
                }
                case 10 -> {
                    System.out.print("Enter Customer ID: ");
                    String id = sc.nextLine();
                    Customer c = service.getCustomer(id);
                    if (c != null) {
                        System.out.println(c);
                    } else {
                        System.out.println("Customer not found.");
                    }
                }
                case 0 -> System.out.println("Exiting... Thank you!");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);
    }
}
