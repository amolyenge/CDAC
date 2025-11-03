package com.demo.QuickSort.test;

import com.QuickSort.sorting.QuickSortAlgorithm;

public class TestQuickSort {

	public static void main(String[] args) {
	 int[] arr = {54,43,333,231,115,208,327,324};
	 
	 QuickSortAlgorithm.quicksort(arr, 0, arr.length - 1);

	}

}
