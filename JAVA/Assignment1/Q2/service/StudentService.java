package Q2.service;
import Q2.beans.Student;
import java.util.Scanner;

public class StudentService {
	
	static Student[] starr;
	static int count;
	static {
		 starr = new Student[10];
	}

  
  
  // function to add Student
  public static void addStudent() {
	  Scanner sc = new Scanner(System.in);
	  Student s1 = new Student();	
	  System.out.println("Enter Data for Student \n");
	  System.out.println("Enter Student id :");
	  int id = sc.nextInt();
	  s1.setStudid(id);
	  System.out.println("Enter Student name: ");
	  String nm = sc.next();
	  s1.setName(nm);
	  System.out.println("Enter Marks for m1: ");
	  double mark1 = sc.nextDouble();
	  s1.setM1(mark1);
	  System.out.println("Enter Marks for m2: ");
	  double mark2 = sc.nextDouble();
	  s1.setM1(mark2);
	  System.out.println("Enter Marks for m3: ");
	  double mark3 = sc.nextDouble();
	  s1.setM1(mark3);
	  // double gpa = (1/3)*mark1+(1/2)*mark2+(1/4)*mark3;  // this roemula is wrong or something is wrong
	  double avgp = ((mark1 + mark2 + mark3) / 300) * 100;
	  double gpa = avgp / 9.5;
	  s1.setGPA(gpa);
	  System.out.println();
	  starr[count] = new Student(id , nm , mark1 , mark2 , mark3 , gpa);
	  count++;
	  System.out.println("Added Successfully..");
  }
  
  // display data 
  
  public static void displayAll() {
	  for(Student std : starr) {
		  if(std != null) {
			  System.out.println("Student Details: \n");
			  System.out.println("Student ID : " + std.getStudid() + "\n");
			  System.out.println("Student Name : " + std.getName() + "\n");
			  System.out.println("Student M1 : " + std.getM1() + "\n");
			  System.out.println("Student M2 : " + std.getM2() + "\n");
			  System.out.println("Student M3 : " + std.getM3() + "\n");
			  System.out.println("Student " + std.getStudid() + " GPA is : " + std.getGPA() + "\n");
			  System.out.println("==================================================");
		  }
	  }
  }
  
  // display  gpa
  public static void showGPA() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Student ID :");
	    int gid = sc.nextInt();
	    boolean found = false;

	    for (Student std : starr) {
	        if (std != null && std.getStudid() == gid) {
	            System.out.println("CGPA of Student Id " + gid + " is " + std.getGPA());
	            found = true;
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("Id not found..");
	    }
	}

  
  // find by id
  public static void findByID() {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Student ID :");
	  int gid = sc.nextInt();
	  for(Student std: starr) {
		  if(std != null) {
			 
		  int id = std.getStudid();
			  if(gid == id) {
				  System.out.println("Student Details: \n");
				  System.out.println("Student ID : " + std.getStudid() + "\n");
				  System.out.println("Student Name : " + std.getName() + "\n");
				  System.out.println("Student M1 : " + std.getM1() + "\n");
				  System.out.println("Student M2 : " + std.getM2() + "\n");
				  System.out.println("Student M3 : " + std.getM3() + "\n");
				break; 
			  }
			  
	
		  }
		  
	  }
	  System.out.println("Id not found..");
	
  }
  
}
