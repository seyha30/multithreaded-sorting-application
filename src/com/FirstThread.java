package com;

public class FirstThread extends Thread {
	private int[] list;

	public int[] getList() {
		return list;
	}

	public void setList(int[] list) {
		this.list = list;
	}

	public FirstThread(int[] list) {
		this.list = list;
	}

	@Override
	public void run() {
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length - 1; j++) {
				if (list[j] >= list[j + 1]) {
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;

				}
			}

		}

		super.run();
		System.out.println(this.getName());
	}

}
