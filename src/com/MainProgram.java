package com;

import java.util.Arrays;

public class MainProgram {

	public static void main(String[] args) {
		int list[] = { 7, 12, 19, 3, 18, 4, 2, 6, 15, 8 };
		int length = list.length - 1;
		long startTime = System.nanoTime();
		/*
		 * for (int i = 0; i <= length; i++) { for (int j = 0; j <= length - 1; j++) {
		 * if (list[j] >= list[j + 1]) { int temp = list[j]; list[j] = list[j + 1];
		 * list[j + 1] = temp;
		 * 
		 * } }
		 * 
		 * }
		 */
//		long endTime = System.nanoTime();
//		System.out.println("Execution time " + (endTime - startTime) + " in milliseconds");
//		System.out.println("Array after sort " + Arrays.toString(list));
		int[] firstArray = new int[(list.length + 1) / 2];
		int[] secondArray = new int[list.length - firstArray.length];
		for (int i = 0; i < list.length; i++) {
			if (i < firstArray.length) {
				firstArray[i] = list[i];
			} else {
				secondArray[i - firstArray.length] = list[i];
			}
		}
		System.out.println("Array 1" + Arrays.toString(firstArray));
		System.out.println("Array 2" + Arrays.toString(secondArray));

//		start thread
		FirstThread firstThread = new FirstThread(firstArray);
		firstThread.start();
		SecondThread secondThread = new SecondThread(secondArray);
		secondThread.start();
		ThirdThread thirdThread = new ThirdThread(firstThread, secondThread);
		thirdThread.start();
	}

}
