package Algorithms;

import java.util.Scanner;

public class Minimun_element_Rotate_Array {
	public static int minimum(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		int centre = 0;
		while (i <= j) {
			centre = (i + j) / 2;
			if (arr[i] < arr[centre]) {
				if (arr[centre] > arr[j]) {
					i = centre + 1;
				} else {
					return arr[i];
				}
			} else {
				if (arr[i] > arr[i + 1]) {
					return arr[i + 1];
				} else {
					j = centre - 1;
				}
			}
		}
		return arr[0];

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println(minimum(arr));

	}

}
