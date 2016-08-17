package Algorithms;

import java.util.Scanner;

public class Compare_the_riplets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d1 = in.nextInt();
		int m1 = in.nextInt();
		int a1 = in.nextInt();

		int d2 = in.nextInt();
		int m2 = in.nextInt();
		int a2 = in.nextInt();

		int p1 = 0;
		int p2 = 0;

		if (d1 > d2) {
			p1 = p1 + 1;
		} else {
			if (d1 < d2) {
				p2 = p2 + 1;
			}
		}

		if (m1 > m2) {
			p1 = p1 + 1;
		} else {
			if (m1 < m2) {
				p2 = p2 + 1;
			}
		}

		if (a1 > a2) {
			p1 = p1 + 1;
		} else {
			if (a1 < a2) {
				p2 = p2 + 1;
			}
		}
		
		System.out.println(p1+" "+p2);

	}
}