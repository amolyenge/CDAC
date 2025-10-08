package Q1;

public class First {

	public static void main(String[] args) {
       if(args.length != 3) {
    	   System.out.println("Enter Three Numbers as Command Line Arguments.");
    	   return;
       }
       
       for(int i = 0; i < 3; i++) {
    	   int num = Integer.parseInt(args[i]);
    	   
    	   if(isPrime(num)) {
    		   System.out.println(num + " is Prime. \n");
    		   System.out.println("Table of " + num + " is \n");
    		   for(int j = 1;j <= 10; j++) {
    			   System.out.println(num + " x " + j + " = " + num * j);
    		   }
    		   System.out.println();
    	   }else {
    		   System.out.println("Number is not Prime..");
    		   double result = num / 10.0;
    		   System.out.println(result);
    	   }
         }
       }
       
       // check if number is prime
       public static boolean isPrime(int num) {
    	   if(num <= 1) return false;
    	   for(int i = 2; i <= Math.sqrt(num);i++) {
    		 if(num % i == 0) {
    			 return false;
    		 }
    	   }
    	   return true;
      
	}

}
