package Algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakingAnagrams {

	public static int numberNeeded(String first, String second) {
		HashMap<Character, Integer> mapa = new HashMap<Character, Integer>();
		int cantidad = 0;

		for (int i = 0; i < first.length(); i++) {
			if (mapa.get(first.charAt(i)) == null) {
				mapa.put(first.charAt(i), 1);
			} else {
				mapa.put(first.charAt(i), mapa.get(first.charAt(i)) + 1);
			}
		}
		for (int i = 0; i < second.length(); i++) {
			char letra = second.charAt(i);
			if (mapa.containsKey(letra)) {
				int valor = mapa.get(letra);
				if (valor == 1) {
					mapa.remove(letra);
				} else {
					mapa.put(letra, valor - 1);
				}
			} else {
				cantidad++;
			}
		}

		for (Map.Entry<Character, Integer> entry : mapa.entrySet()) {
			cantidad += entry.getValue();
		}
		return cantidad;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}

}
