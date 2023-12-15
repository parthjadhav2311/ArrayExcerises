package com.parth.ArrayExcerises;

import java.util.Arrays;

public class DuplicateElementInArray {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 4, 2, 3, 5,3,8,2,7 };

		int[] result = findDuplicateElements(nums);
		System.out.println(Arrays.toString(result));
	}

	public static int[] findDuplicateElements(int[] nums) {

		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
					break;
				}
			}
		}

		int[] duplicateElements = new int[count];
		count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					duplicateElements[count] = nums[i];
					count++;
					break;
				}
			}
		}

		return Arrays.copyOf(duplicateElements,count);
	}

}