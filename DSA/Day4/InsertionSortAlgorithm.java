package com.InsertionSort.sorting;

import java.util.Arrays;

public class InsertionSortAlgorithm {
	
	// Ascending
  public static void insertionSortAscending(int[] arr) {
	  for(int i = 1; i< arr.length; i++) {
		  int j = i - 1;
		  int key = arr[i];
		  
		  while(j >= 0 && arr[j] > key) {
			  arr[j+1] = arr[j];
			  j--;
		  }
		  
		  arr[j + 1] = key;
		  System.out.println(Arrays.toString(arr));
	  }
  }
  
  //Descending
  public static void insertionSortDescending(int[] arr) {
	  for(int i = 1; i < arr.length; i++){
		  int j = i - 1;
		  int key = arr[i];
		  while(j>=0 && arr[j]<key) {
				arr[j+1]=arr[j];
				j--;
			}
		  arr[j + 1] = key;
		  System.out.println(Arrays.toString(arr));
	  }
  }
  
}
