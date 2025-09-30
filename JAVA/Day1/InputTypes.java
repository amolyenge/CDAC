import java.util.Scanner;

class InputTypes{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number");
         int n = sc.nextInt();
       System.out.println(n);

       System.out.println("Enter Float");
         float n1 = sc.nextFloat();
       System.out.println(n1);

       System.out.println("Enter Double");
         double n2 = sc.nextDouble();
       System.out.println(n2);

       System.out.println("Enter String");
         String str = sc.nextLine();
       System.out.println(str);

   }
}