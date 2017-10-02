package Algorithms;

import java.util.Scanner;

public class SavethePrisoner {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			long n = in.nextInt();
			long m = in.nextInt();
			long s = in.nextInt();

			long p = (s + m - 1) % n;
			if (p == 0) {
				p = n;
			}
			System.out.println(Math.abs(p));
		}

	}

}
