package datastructure.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return
 * the median of the two sorted arrays.
 *
 */
public class MedianOfTwoSortedArrays {
	public static void main(String[] args) {
		int a[] = {2};
		int b[] = {};
		System.out.println(findMedianSortedArrays(a, b));

	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int[] tempArr = new int[(nums1.length + nums2.length)];
		double median = 0.0;
		int i = 0, j = 0, k = 0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] < nums2[j]) {
				tempArr[k++] = nums1[i];
				i++;
			} else {
				tempArr[k++] = nums2[j];
				j++;
			}
		}
		while (j < nums2.length) {
			tempArr[k++] = nums2[j];
			j++;
		}
		while (i < nums1.length) {
			tempArr[k++] = nums1[i];
			i++;
		}
		System.out.println("------------------------");
		Arrays.stream(tempArr).forEach(System.out::println);
		System.out.println("------------------------");
		System.out.println(tempArr.length);
		System.out.println("------------------------");
		int mid = (tempArr.length / 2);
		if(tempArr.length ==1) {
			return tempArr[0];
		}
		if (tempArr.length % 2 == 0) {
			mid =mid-1;
			median = (double)(tempArr[mid] + tempArr[mid + 1]) / 2;
			return median;
		} else {
			return tempArr[mid];
		}

	}

}
