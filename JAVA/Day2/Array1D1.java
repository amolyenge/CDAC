import java.util.Scanner;

public class Array1D1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        takeInput(arr);
        printArray(arr);         
    }

      // Accept Elements
    public static void takeInput(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements of  array: ");
         for(int i = 0; i < arr.length ; i++){
         arr[i] = sc.nextInt();
         }
    }

     // Print Elements
    public static void printArray(int[] arr){
         for(int i = 0; i < arr.length;i++){
                System.out.println("Element at index" + i + " is : " + arr[i]);   
          }
    }   
  
}
