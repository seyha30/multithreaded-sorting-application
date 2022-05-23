package com;

public class MainProgram {

	public static void main(String[] args) {
		int list[] = { 7, 12, 19, 3, 18, 4, 2, 6, 15, 8 };
		int[] firstArray = new int[(list.length + 1) / 2];
		int[] secondArray = new int[list.length - firstArray.length];
		for (int i = 0; i < list.length; i++) {
			if (i < firstArray.length) {
				firstArray[i] = list[i];
			} else {
				secondArray[i - firstArray.length] = list[i];
			}
		}

//		start thread
		FirstThread firstThread = new FirstThread(firstArray);
		firstThread.start();
		SecondThread secondThread = new SecondThread(secondArray);
		secondThread.start();
		ThirdThread thirdThread = new ThirdThread(firstThread, secondThread);
		thirdThread.start();
	}

	protected static class Data {
		static int orginalArray[] = { 7, 12, 19, 3, 18, 4, 2, 6, 15, 8 };
		static int mergeArray[];

	}

}
