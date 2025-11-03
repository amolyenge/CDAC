package com.MergeSort.test;

import com.MergeSort.sorting.MergerSortAlgorithm;

public class TestMergerSort {

	public static void main(String[] args) {
		
		int[] arr = {90,2,1,43,5,65,7,89};
		MergerSortAlgorithm.mergeSortAscending(arr, 0, arr.length - 1);
	}

}
