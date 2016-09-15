package Statictics;

import java.util.HashMap;
import java.util.Scanner;

public class Mean_Median_Mode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Double suma = 0.0;
		Double mean = 0.0;
		Double median = 0.0;
		Double mode = 0.0;

		HashMap<Double, Integer> tabla = new HashMap<Double, Integer>();
		Double[] a = new Double[n];

		for (int i = 0; i < n; i++) {
			Double num = 0.0;
			num = num.parseDouble(in.next());

			if (tabla.get(num) == null) {
				tabla.put(num, 1);
				a[i] = num;
				suma = suma + num;
			} else {
				tabla.put(num, tabla.get(num) + 1);
				suma = suma + num;
				a[i] = num;
			}
		}
		Double aux = 0.0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					aux = a[i];
					a[i] = a[j];
					a[j] = aux;
				}
			}

		}

		if (n % 2 != 0) {
			median = a[(n-1) / 2];
		} else {
			median = (a[n / 2 - 1] + a[n / 2]) / 2;
		}
		int cant = 0;
		for (int i = 0; i < a.length; i++) {
			if (cant < tabla.get(a[i])) {
				mode = a[i];
				cant = tabla.get(a[i]);
			}
		}
		if (cant == 1) {
			mode = a[0];
		}
		mean = suma / n;
		System.out.printf("%.1f", mean);
		System.out.println();
		System.out.printf("%.1f", median);
		System.out.println();
		System.out.printf("%.0f", mode);
		System.out.println();

	}

}
