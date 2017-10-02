package Algorithms;

import java.util.Scanner;

public class String_has_unic_character {

	public static boolean isUnic(String chain) {
		int i = 0;
		while (i < chain.length()) {
			Character c = chain.charAt(i);
			String ch = chain.substring(i + 1);
			if (ch.contains(c.toString()))
				return false;
			i++;
		}
		return true;
	}

	public static boolean duplicateCharacters(String chain) {
		boolean[] unic = new boolean[256];
		for (int i = 0; i < chain.length(); i++) {
			char c = chain.charAt(i);
			if (unic[c] == true) {
				return false;
			} else {
				unic[c] = true;
			}

		}
		return true;
	}

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String chain = in.next();
		
		System.out.println(isUnic(chain));
		System.out.println(duplicateCharacters(chain));

	}

}
