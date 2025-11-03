package com.CountSort.test;

import java.util.Arrays;

import com.CountSort.sorting.CountSortAlgorithm;

public class TestCountingSort {

	public static void main(String[] args) {
		int[] arr= {6,5,4,8,6,9,5,3,4,6,9};
		int[] output=CountSortAlgorithm.countingSortAscending(arr);
		System.out.println("sorted data");
		System.out.println(Arrays.toString(output));
	}

}
