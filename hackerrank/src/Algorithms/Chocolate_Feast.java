package Algorithms;

import java.util.Scanner;

public class Chocolate_Feast {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();
			int ch = (n / c);
			int res = ch;

			while (ch >= m) {
				n = ch / m;
				res = res + n;
				ch = n + (ch % m);

			}

			System.out.println(res);

		}

	}

}
