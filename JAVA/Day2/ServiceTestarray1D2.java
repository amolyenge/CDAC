import java.util.Scanner;

public class ServiceTestarray1D2 {
    // Accept Elements
  public static void takeInput(int[] arr) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Elements of  array: ");
       for(int i = 0; i < arr.length ; i++){
       arr[i] = sc.nextInt();
       }
  }

   // Addition of  Elements
  public static int addElements(int[] arr){
       int sum = 0;
       for(int i = 0; i < arr.length;i++){
               sum += arr[i];
        }
     return sum;
  }   

 //Print Min Element in array
  public static int minElement(int[] arr){
        int min = arr[0];
        for(int i = 0 ; i < arr.length; i++){
              if(arr[i] < min){
                 min = arr[i];
              }
        }
     return min;
  } 

 //Print Max Element in array
  public static int maxElement(int[] arr){
        int max = arr[0];
        for(int i = 0 ; i < arr.length; i++){
              if(arr[i] > max){
                 max = arr[i];
              }
        }
     return max;
  }

 //Print index of Element in array
  public static int findElement(int[] arr , int target){
        for(int i = 0 ; i < arr.length; i++){
              if(arr[i] == target){
                 return i;
              }
        }
     return -1;
  }
}
