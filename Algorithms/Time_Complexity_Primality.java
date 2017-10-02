package Algorithms;

import java.util.Scanner;

public class Time_Complexity_Primality {
	public static boolean primality(int n) {
		int end = (int) Math.sqrt(n);
		if (n != 1) {
			for (int i = 2; i <= end; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		for (int a0 = 0; a0 < p; a0++) {
			int n = in.nextInt();
			if (primality(n)) {
				System.out.println("Prime");
			} else {
				System.out.println("Not Prime");
			}
		}

	}

}
