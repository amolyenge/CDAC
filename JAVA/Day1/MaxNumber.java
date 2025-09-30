import java.util.Scanner;

class MaxNumber{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
     
        if(num1 == num2 && num2  == num3){
             System.out.println("All are same:" + num1);
           }else if(num1 > num2  && num1 > num3){
             System.out.println("Num1 is bigger." + num1);
           }else if(num2 > num1 && num2 > num3){
              System.out.println("num2 is greater:" + num2);
           }else{
               System.out.println("num3 is greater:" + num3);
          } 


   }
}