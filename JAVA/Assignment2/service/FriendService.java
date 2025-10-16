package com.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import com.demo.beans.Friend;

public class FriendService {
    static Friend[] farr = new Friend[10];
    static int count = 0;

    // Add new Friend
    public static void addNewFriend() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Friend ID:");
        int id = sc.nextInt();

        System.out.println("Enter Friend First Name:");
        String fname = sc.next();

        System.out.println("Enter Friend Last Name:");
        String lname = sc.next();

        System.out.println("How Many Hobbies you want to add?");
        int n = sc.nextInt();
        String[] hb1 = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Hobby no " + (i + 1) + ":");
            hb1[i] = sc.next();
        }

        System.out.println("Enter Mobile Number:");
        Long mn = sc.nextLong();

        System.out.println("Enter Email of Friend:");
        String email = sc.next();

        System.out.println("Enter Birth Date dd/MM/yyyy:");
        String bdate = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = null;
        try {
            dt = sdf.parse(bdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Enter Address:");
        String add = sc.next();

        Friend f1 = new Friend(id, fname, lname, hb1, mn, email, dt, add);
        farr[count++] = f1;
        System.out.println("Friend Added Successfully.");
    }

    // Display All Friend Data
    public static void displayAll() {
        boolean found = false;
        for (Friend f : farr) {
            if (f != null) {
                found = true;
                displayFriend(f);
            }
        }
        if (!found) {
            System.out.println("No Data Available.");
        }
    }

    // Search Friend by ID
    public static void searchByID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Friend ID:");
        int id = sc.nextInt();
        boolean found = false;
        for (Friend f : farr) {
            if (f != null && f.getFid() == id) {
                displayFriend(f);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Friend with ID " + id + " not found.");
        }
    }

    // Search Friend by Name
    public static void searchByName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Friend First Name:");
        String name = sc.next();
        boolean found = false;
        for (Friend f : farr) {
            if (f != null && f.getFname().equalsIgnoreCase(name)) {
                displayFriend(f);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Friend with name " + name + " not found.");
        }
    }

    // Search Friends by Hobby
    public static void searchByHobby() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hobby to search:");
        String hobby = sc.next();
        boolean found = false;
        for (Friend f : farr) {
            if (f != null && f.getHobbies() != null) {
                for (String h : f.getHobbies()) {
                    if (h.equalsIgnoreCase(hobby)) {
                        displayFriend(f);
                        found = true;
                        break;
                    }
                }
            }
        }
        if (!found) {
            System.out.println("No friends found with hobby: " + hobby);
        }
    }

    // Helper method to display friend details
    private static void displayFriend(Friend f) {
        System.out.println("Friend Details:");
        System.out.println("Friend ID: " + f.getFid());
        System.out.println("First Name: " + f.getFname());
        System.out.println("Last Name: " + f.getLname());
        System.out.println("Hobbies: " + Arrays.toString(f.getHobbies()));
        System.out.println("Mobile Number: " + f.getMobno());
        System.out.println("Email: " + f.getEmail());
        System.out.println("Birth Date: " + f.getBdate());
        System.out.println("Address: " + f.getAdress());
        System.out.println("==================================================");
    }
}
