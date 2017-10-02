package Algorithms;

import java.util.Scanner;

public class UtopianTree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();

			if (n == 0) {
				System.out.println(1);
			} else {
				if (n == 1) {
					System.out.println(2);
				} else {
					int h = 1;
					int i = 0;
					while (i < n) {
						if (i % 2 == 0) {
							h = h * 2;
						} else {
							h = h + 1;
						}
						i++;
					}
					System.out.println(h);

				}

			}

		}
	}
}
