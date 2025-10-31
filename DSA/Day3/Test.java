package com.Sorting.BubbleSort;

public class Test {

	public static void main(String[] args) {
      int[] arr = {23,54,45,67,87,90,98,78};
      
      BubbleSortService.bubbleSort(arr);
      System.out.println("=============================================");
      System.out.println("Ascending ..");
      BubbleSortService.bubbleSortImproved(arr);
      System.out.println("=============================================");
      System.out.println("Descending ..");
      BubbleSortService.bubbleSortImprovedDescending(arr);
		
	}

}
