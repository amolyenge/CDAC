package Q2.test;
import Q2.service.StudentService;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
       System.out.println("Welcome to Student Management System\n");
       Scanner sc = new Scanner(System.in);
       int choice = 0;
       do {
    	   System.out.println("1) Add new Student\n2) Display All Students");
    	   System.out.println("3) search by id\n4) Get GPA of Student \n");
    	   System.out.println("Enter choice: ");
   	    choice = sc.nextInt();
    	   
    	   switch(choice) {
    	   case 1:
    		   StudentService.addStudent();
    		   break;
    	   case 2:
    		   StudentService.displayAll();
    		   break;
    	   case 3:
    		   StudentService.findByID();
    		   break;
    	   case 4:
    		   StudentService.showGPA();
    		   break;
    	   case 5:
    		   sc.close();
    		   break;
    	   default:
    		   System.out.println("Wrong choice");
    	   }

       }while(choice != 5);
	}

}
