package com;

import java.util.Arrays;

public class MainProgram {

	public static void main(String[] args) {
		int lst[] = { 7, 12, 19, 3, 18, 4, 2, 6, 15, 8 };
		int length = lst.length - 1;
		for (int i = 0; i <= length; i++) {
			for (int j = i + 1; j <= length; j++) {

				if (lst[i] < lst[j]) {
					lst[i] = lst[j];
				}
			}

		}
		System.out.println(" Array after sort " + Arrays.toString(lst));

	}

}
