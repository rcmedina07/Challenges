package Algorithms;

import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d1 = in.nextInt();
		int m1 = in.nextInt();
		int a1 = in.nextInt();

		int d2 = in.nextInt();
		int m2 = in.nextInt();
		int a2 = in.nextInt();

		if (a1 < a2) {
			System.out.println(0);
		} else {
			if (a1 == a2) {
				if (m1 < m2) {
					System.out.println(0);
				} else {
					if (m1 == m2) {
						if (d1 <= d2) {
							System.out.println(0);
						} else {
							System.out.println(15 * (d1 - d2));
						}
					} else {
						System.out.println(500 * (m1 - m2));
					}
				}
			} else {
				System.out.println(10000);
			}
		}

	}
}