package Algorithms;

import java.util.HashMap;

public class CountDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[] { 1, 2, 2, 4 };
		HashMap<Integer, Integer> tabla = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < numbers.length; i++) {
			if (tabla.get(numbers[i]) == null) {
				tabla.put(numbers[i], 1);
			} else {
				tabla.put(numbers[i], tabla.get(numbers[i]) + 1);
			}

		}
		int result = 0;
		for (int i : tabla.values()) {
			if (i > 1) {
				result++;
			}

		}
	}

}
