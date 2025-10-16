package com.demo.test;
import java.util.Scanner;

import com.demo.service.FriendService;

public class TestFriend {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int choice;
       do {
           System.out.println("Welcome my Friend !");
           System.out.println("Enter the choice : \n");
           System.out.println("1) Add new Friend.\n2) Display All Friends");
           System.out.println("3) Search By ID.\n4) Search By Name.");
           System.out.println("5) Display All with Hobby.\n6) exit\n");
           System.out.println("Enter choice : ");
           choice = sc.nextInt();
           
           switch(choice) {
           case 1:
        	   FriendService.addNewFriend();
        	   break;
           case 2:
        	   FriendService.displayAll();
        	   break;
           case 3:
        	   FriendService.searchByID();
        	   break;
           case 4:
        	   FriendService.searchByName();
        	   break;
           case 5:
        	   FriendService.searchByHobby();
        	   break;
           case 6:
        	   sc.close();
        	   break;
           default :
        	   System.out.println("Wrong Choice !");
        	   break;
           }
           
       }while(choice != 6);
       
       System.out.println("Thank you !");
       
	}

}
