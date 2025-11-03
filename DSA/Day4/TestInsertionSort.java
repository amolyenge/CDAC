package com.InsertionSort.test;

import com.InsertionSort.sorting.InsertionSortAlgorithm;

public class TestInsertionSort {

	public static void main(String[] args) {
		int[] arr = {2,6,21,5,43,33,43};
		InsertionSortAlgorithm.insertionSortAscending(arr);
		InsertionSortAlgorithm.insertionSortDescending(arr);

	}

}
