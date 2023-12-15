package com.parth.ArrayExcerises;

public class FindUniqueElements {
	
	public static void main(String[] args) {
		int[] array = { 7,3,2,55,60,90 };
		FindUniqueElemnts(array);
	}

	public static void FindUniqueElemnts(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++)
				if (array[i] == array[j]) {
					break;
				}
		}

		int i = 0;
		int j = 0;
		if (i == j)
			System.out.println("UniqueElement is:" + array[i]);
	}

}


