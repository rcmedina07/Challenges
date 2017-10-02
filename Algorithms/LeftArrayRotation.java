package Algorithms;

import java.util.Scanner;

public class LeftArrayRotation {

	public static int[] arrayLeftRotation(int[] a, int n, int k) {
		int[] result = new int[a.length];
		int i = 0;
		for (int j = k; j < a.length; j++) {
			result[i] = a[j];
			i++;
		}
		for (int h = 0; h < k; h++) {
			result[i] = a[h];
			i++;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		int[] output = new int[n];
		output = arrayLeftRotation(a, n, k);
		for (int i = 0; i < n; i++)
			System.out.print(output[i] + " ");

		System.out.println();

	}
}
