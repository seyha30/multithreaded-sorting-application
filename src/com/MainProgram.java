package com;

import java.util.Arrays;

public class MainProgram {

	public static void main(String[] args) {
		int lst[] = { 7, 12, 19, 3, 18, 4, 2, 6, 15, 8 };
		int length = lst.length - 1;
		long startTime = System.nanoTime();
		for (int i = 0; i <= length; i++) {
			for (int j = 0; j <= length - 1; j++) {
				int temp = lst[j];
				if (lst[j] >= lst[j + 1]) {
					lst[j] = lst[j + 1];
					lst[j + 1] = temp;

				}
			}

		}
		long endTime = System.nanoTime();
		System.out.println("Exceution time " + (endTime - startTime) + " in milliseconds");
		System.out.println("Array after sort " + Arrays.toString(lst));

	}

}
