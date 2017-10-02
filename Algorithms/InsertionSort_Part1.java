package Algorithms;

import java.util.Scanner;

public class InsertionSort_Part1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void insertIntoSorted(int[] ar) {
		// Fill up this function
		int elem = ar[ar.length - 1];
		int i = 0;
		for (i = ar.length - 1; i > 0 && (ar[i - 1] > elem); i--) {
			ar[i] = ar[i - 1];
			printArray(ar);
		}
		ar[i] = elem;
		printArray(ar);
	}
}
