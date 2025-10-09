package com.demo.Strings;

import java.util.Arrays;

public class TestString2 {
  public static void main(String[] args) {
	  
	  String s1 = "Amol";
	  String s2 = "Amol";
	  String s3 = "Yenge";
	  String s4 = new String("Amol");
	  String s5 = "Abhi";
	  
	  // check String Methods
	  
	  System.out.println("s1 == s2" + s1 == s2);  // false
	  System.out.println("s1.equals(s2)  : " + s1.equals(s2)); // true
	  System.out.println("s1 == s3" + s1 == s3); // false
	  System.out.println("s1 == s4" + s1 == s4); // false
	  System.out.println("s1.equals(s4)  : " + s1.equals(s4));  // true
	  System.out.println("s3 == s5" + s3 == s5); // false
	  
	  StringBuffer sb = new StringBuffer("Hello");
	  sb.append(" Everyone");
	  System.out.println(sb); // Hello Everyone
	  
	  StringBuilder sb1 = new StringBuilder("Amol");
	  sb1.append(" Yenge");
	  System.out.println(sb1); // Amol Yenge
	  
	  String str = "date-id-dd-mm-yyyy";
	  String[] arr = str.split("-");
	  System.out.println("String before Split : " + str);
	  System.out.println("Splited String is : " + Arrays.toString(arr));
	  
	  String str1 = String.join("/", arr);
	  System.out.println("Joined String by / : " + str1);
	  
	  
  }
}
