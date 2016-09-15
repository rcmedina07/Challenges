package Statictics;

import java.util.Scanner;

public class Interquartile_Range {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] x = new int[n];
		int[] f = new int[n];

		int j = 0;

		Double q1 = 0.0;
		Double q3 = 0.0;
		int suma = 0;

		for (int i = 0; i < n; i++) {
			x[i] = in.nextInt();
		}

		for (int i = 0; i < n; i++) {
			f[i] = in.nextInt();
			suma = suma + f[i];
		}
		int[] s = new int[suma];

		for (int i = 0; i < n; i++) {
			while (f[i] > 0) {
				s[j] = x[i];
				f[i]--;
				j++;
			}
		}

		int aux = 0;
		for (int i = 0; i < s.length - 1; i++) {
			for (int h = i + 1; h < s.length; h++) {
				if (s[i] > s[h]) {
					aux = s[i];
					s[i] = s[h];
					s[h] = aux;
				}
			}
		}
		int m = s.length;

		if ((m / 2) % 2 == 0) {
			q1 = (double) ((s[(m / 2) / 2 - 1] + s[(m / 2) / 2]) / 2);
			q3 = (double) ((s[(m / 2) + ((m / 2) / 2)] + s[((m / 2) + ((m / 2)) / 2) - 1]) / 2);
		} else {
			q1 = (double) (s[((m - 1) / 2) / 2]);
			q3 = (double) (s[(((m - 1) / 2) + ((m - 1) / 2) / 2) + 1]);
		}

		Double resto = q3 - q1;

		System.out.printf("%.1f", resto);
		System.out.println();

	}

}
