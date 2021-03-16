package datastructure.arrays;

import java.util.Arrays;

/**
 * Given an unsorted array A of size N that contains only non-negative integers,
 * find a continuous sub-array which adds to a given number S.
 *
 */
public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 7,5 };
		findSum(a);
	}

	public static void findSum(int a[]) {
		System.out.println("hi");
		int sum =12;
		
		for (int i = 0; i < a.length; i++) {
			int tempSum=a[i];
			for (int j = i+1; j < a.length; j++) {
				tempSum = tempSum+a[j];
				if(sum==tempSum) {
					System.out.println(i+"  "+j);
				}
			}
		}

	}
}
