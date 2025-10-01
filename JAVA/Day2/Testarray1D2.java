import java.util.Scanner;

public class Testarray1D2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        ServiceTestarray1D2.takeInput(arr);
        System.out.println("Addition of Elements is : " + ServiceTestarray1D2.addElements(arr)); 
        int min = ServiceTestarray1D2.minElement(arr);
        System.out.println("Min Element is : " + min);  
        int max = ServiceTestarray1D2.maxElement(arr);
        System.out.println("Max Element is : " + max);   
        int ans = ServiceTestarray1D2.findElement(arr,15);
        System.out.println("Index of element is : " + ans);    
    }
  
}
