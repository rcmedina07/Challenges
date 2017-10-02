package Algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hash_Tables_Ransom_Note {

	public static void Solution(String magazine, String note) {
		String[] revista = magazine.split(" ");
		String[] nota = note.split(" ");

		Map<String, Integer> magazineMap = new HashMap<String, Integer>();

		for (int i = 0; i < revista.length; i++) {
			String elem = revista[i];
			if (magazineMap.get(elem) == null) {
				magazineMap.put(elem, 1);
			} else {
				magazineMap.put(elem, magazineMap.get(elem) + 1);
			}
		}
		int cant = 0;
		for (int i = 0; i < nota.length; i++) {
			String elem = nota[i];
			if (magazineMap.containsKey(elem)) {
				int valor = magazineMap.get(elem);
				if (valor == 1) {
					magazineMap.remove(elem);
					cant++;
				} else {
					magazineMap.put(elem, valor - 1);
					cant++;
				}

			}
		}

		if (cant == nota.length)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Eat whitespace to beginning of next line
		scanner.nextLine();

		Solution(scanner.nextLine(), scanner.nextLine());
		scanner.close();

	}
}
