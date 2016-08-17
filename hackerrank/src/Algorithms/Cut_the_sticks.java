package Algorithms;

import java.util.Scanner;

public class Cut_the_sticks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int min = 0;
		int cut = 0;
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		int j = arr.length;
		while (j > 1) {
			min = 1001;
			for (int i = 0; i < arr.length; i++) {
				if (min > arr[i] && arr[i] > 0) {
					min = arr[i];
				}
			}
			if (min < 1001) {
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] > 0) {
						arr[i] = arr[i] - min;
						cut++;
					}

				}
			}
			if (cut > 0) {
				System.out.println(cut);
			}
			j = cut;
			cut = 0;
		}

	}
}
