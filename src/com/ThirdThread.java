package com;

public class ThirdThread extends Thread {

	private FirstThread firstThread;
	private SecondThread secondThread;

	public ThirdThread(FirstThread firstThread, SecondThread secondThread) {
		this.firstThread = firstThread;
		this.secondThread = secondThread;
	}

	@Override
	public void run() {

		super.run();
	}

}
