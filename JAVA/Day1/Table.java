class Table{
   public static void main(String[] args){
      printData(Integer.parseInt(args[0]));
  }

   public static void printData(int n){
       int mul = 1;
      for(int i = 1; i <= 10; i++){
             mul = n * i;
             System.out.println(n + "x" + i + "=" + mul);
       }
   }

}