package Algorithms;

import java.util.Scanner;

public class All_permutations_of_a_string {

	public static void permutations(Character[] chain, int l, int r) {
		Character aux = null;
		if (l == r) {
			System.out.println(chain[l]);
		} else {
			for (int i = l; i <= r; i++) {
				aux = chain[l];
				chain[l] = chain[i];
				chain[i] = aux;
				permutations(chain, l + 1, r);
				aux = chain[l];
				chain[l] = chain[i];
				chain[i] = aux;
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String chain = in.next();
		
		Character[] ch = new Character[chain.length()];

		for (int i = 0; i < chain.length(); i++) {
			ch[i] = chain.charAt(i);
		}

		permutations(ch, 0, ch.length-1);


	}

}
