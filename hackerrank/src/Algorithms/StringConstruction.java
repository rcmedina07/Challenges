package Algorithms;

import java.util.Scanner;

public class StringConstruction {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			String s = in.next();

			int i = 0;
			String p = new String();
			int contador = 0;

			while (i < s.length()) {
				if (p.indexOf(s.charAt(i)) < 0) {
					p = p + s.charAt(i);
					contador++;
				}
				i++;
			}
			System.out.println(contador);

		}

	}

}
