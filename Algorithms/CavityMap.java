package Algorithms;

import java.util.HashMap;
import java.util.Scanner;

public class CavityMap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		Integer[][] map = new Integer[n][n];
		Character[][] mapR = new Character[n][n];

		for (int i = 0; i < n; i++) {
			String cadena = in.nextLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = (int) cadena.charAt(j);
				mapR[i][j] = cadena.charAt(j);
			}
		}

		for (int i = 1; i < n - 1; i++) {
			for (int j = 1; j < n - 1; j++) {
				Integer cav = map[i][j];
				Integer cont = 0;
				for (int k = i - 1; k <= i + 1; k++) {
					for (int h = j - 1; h <= j + 1; h++) {
						if (cav >= map[k][h] && !(k==i && h==j) && !(k==i-1 && h==j-1) && !(k==i-1 && h==j+1) && !(k==i+1 && h==j-1) && !(k==i+1 && h==j+1)) {
							cont++;
						}
					}
				}
				if (cont == 4) {
					mapR[i][j] = 'X';
				}
			}

		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mapR[i][j]);
			}
			System.out.println();
		}

	}
}
