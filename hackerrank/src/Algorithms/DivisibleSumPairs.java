package Algorithms;

import java.util.Scanner;

public class DivisibleSumPairs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		int cant = 0;
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 1; j < a.length; j++) {
				if (((a[i] + a[j]) % k == 0) && (i < j)) {
					cant++;
				}
			}

		}
		System.out.println(cant);
	}

}
