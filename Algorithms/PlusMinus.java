package Algorithms;

import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		float p = 0;
		float ne = 0;
		float c = 0;

		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
			if (arr[arr_i] > 0) {
				p++;
			}
			if (arr[arr_i] < 0) {
				ne++;
			}
			if (arr[arr_i] == 0) {
				c++;
			}
		}

		p = p / n;
		ne = ne / n;
		c = c / n;

		System.out.println(p);
		System.out.println(ne);
		System.out.println(c);

	}

}
