package Algorithms;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x1 = in.nextInt();
		double v1 = in.nextInt();
		double x2 = in.nextInt();
		double v2 = in.nextInt();
		double s = 0.0;

		if ((x2 > x1) && (v2 >= v1)) {
			System.out.println("NO");
		} else {
			s = (x1 - x2) / (v2 - v1);
			if (s == Math.floor(s)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}
