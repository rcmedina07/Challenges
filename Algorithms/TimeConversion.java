package Algorithms;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

public class TimeConversion {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String time = in.next();
		int h = Integer.valueOf(time.substring(0, 2));

		if (time.contains("PM")) {
			if (h == 12) {
				System.out.println(time.substring(0, 8));
			} else {
				h = h + 12;
				System.out.println(h + time.substring(2, 8));
			}
		} else {
			if (h == 12) {
				System.out.println("00" + time.substring(2, 8));
			} else {
				System.out.println(time.substring(0, 8));
			}
		}
	}

}
