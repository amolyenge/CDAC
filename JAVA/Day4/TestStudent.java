import java.util.Date;

public class TestStudent {

	public static void main(String[] args) {
       Student s1 = new Student(101,"Amol",97,98,new Date());
       System.out.println(s1);
       
       Student s2 = new Student(102, "Abhi" , 98,99,new Date());
       System.out.println(s2);
	}

}
