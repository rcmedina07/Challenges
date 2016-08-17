package Algorithms;

import java.util.Scanner;

public class SimpleArraySum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
			System.out.print(arr[arr_i] + " ");
		}

		for (int b = n - 1; b >= 0; b--) {
			System.out.print(arr[b] + " ");
		}
	}

}
