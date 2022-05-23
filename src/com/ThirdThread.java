package com;

import java.util.Arrays;

public class ThirdThread extends Thread {

	private FirstThread firstThread;
	private SecondThread secondThread;
	private int unsortArray[];

	public ThirdThread(FirstThread firstThread, SecondThread secondThread) {
		this.firstThread = firstThread;
		this.secondThread = secondThread;
	}

	@Override
	public void run() {
		merge();
		System.out.println("unsortArray " + Arrays.toString(unsortArray));
	}

	public void merge() {

		unsortArray = new int[firstThread.getList().length + secondThread.getList().length];
		int k = 0;
		for (int i = 0; i < firstThread.getList().length; i++) {

			unsortArray[k] = firstThread.getList()[i];
			k++;
		}
		for (int i = 0; i < secondThread.getList().length; i++) {

			unsortArray[k] = secondThread.getList()[i];
			k++;
		}

	}

}
