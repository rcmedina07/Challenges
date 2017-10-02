package Algorithms;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int w = 0;

		while (w < T) {
			int n = in.nextInt();
			int k = in.nextInt();
			Integer con = 0;
			for (int i = 0; i < n; i++) {
				if (in.hasNextInt() && in.nextInt() <= 0) {
					con++;
				}
			}
			if (con >= k) {
				System.out.println("No");
			} else {
				System.out.println("YES");
			}
			w++;
		}
	}

}
