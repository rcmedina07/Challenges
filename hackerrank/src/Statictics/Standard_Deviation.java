package Statictics;

import java.util.Scanner;

public class Standard_Deviation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] num = new int[n];

		Double mean = 0.0;
		Double suma = 0.0;
		Double d = 0.0;

		for (int i = 0; i < n; i++) {
			num[i] = in.nextInt();
			mean = mean + num[i];
		}
		mean = mean / n;
		for (int i = 0; i < num.length; i++) {
			suma = suma + Math.pow(num[i] - mean, 2);
		}
		
		d = Math.sqrt(suma / n);
		System.out.printf("%.1f", d);
	}

}
