package Statictics;

import java.util.Scanner;

public class Quartiles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] num = new int[n];

		Double q1 = 0.0;
		Double q2 = 0.0;
		Double q3 = 0.0;

		for (int i = 0; i < n; i++) {
			num[i] = in.nextInt();
		}

		int aux = 0;
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					aux = num[i];
					num[i] = num[j];
					num[j] = aux;
				}
			}
		}

		if (n % 2 != 0) {
			q1 = (double) num[(n - 1) / 2];
			q2 = (double) ((num[((n - 1) / 2) / 2 - 1] + num[((n - 1) / 2) / 2]) / 2);
			q3 = (double) ((num[((n - 1) / 2) + (((n - 1) / 2) / 2)] + num[(((n - 1) / 2) + (((n - 1) / 2)) / 2) + 1])
					/ 2);
		} else {
			if ((n / 2) % 2 == 0) {
				q1 = (double) ((num[n / 2 - 1] + num[n / 2]) / 2);
				q2 = (double) ((num[(n / 2) / 2 - 1] + num[(n / 2) / 2]) / 2);
				q3 = (double) ((num[(n / 2) + ((n / 2) / 2)] + num[((n / 2) + ((n / 2)) / 2) -1]) / 2);
			} else {
				q1 = (double) ((num[n / 2 - 1] + num[n / 2]) / 2);
				q2 = (double) (num[((n - 1) / 2) / 2]);
				q3 = (double) (num[(((n - 1) / 2) + ((n - 1) / 2) / 2) + 1]);
			}
		}

		System.out.printf("%.0f", q2);
		System.out.println();
		System.out.printf("%.0f", q1);
		System.out.println();
		System.out.printf("%.0f", q3);
		System.out.println();
	}

}
