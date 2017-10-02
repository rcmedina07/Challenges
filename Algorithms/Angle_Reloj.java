package Algorithms;

import java.util.Scanner;

public class Angle_Reloj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float h = in.nextFloat();
		float m = in.nextFloat();
		if (h == 12)
			h = 0;

		double a1m = 360 / 60;
		double a1h = 360 / 12;

		double am = m * a1m;
		double ah = (h + (m / 60)) * a1h;
		double angle = Math.abs(ah - am);

		System.out.printf("angle = %.1f", angle);

	}

}
