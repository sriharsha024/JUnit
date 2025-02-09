
package com.java;

import java.util.Arrays;

public class SortingArrayPerformance {
	public int[] sortingArray(int[] array) {
		for(int i=0;i<100000000;i++){
			Arrays.sort(array);
		}
		return array;
	}
}
