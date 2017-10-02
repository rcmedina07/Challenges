package Statictics;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Weighted_Mean {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Double sumaw = 0.0;
		Double sumaxw = 0.0;
		Double[] x = new Double[n];
		Double[] w = new Double[n];

		for (int i = 0; i < n; i++) {
			Double num = 0.0;
			num = num.parseDouble(in.next());
			x[i] = num;
		}
		for (int i = 0; i < n; i++) {
			Double num = 0.0;
			num = num.parseDouble(in.next());
			w[i] = num;
			sumaw = sumaw + num;
			sumaxw = sumaxw + (x[i] * num);
		}
		Double res = sumaxw / sumaw;
		System.out.printf("%.1f", res);
	}

}
