package Algorithms;

import java.util.HashMap;
import java.util.Scanner;

public class Sparse_Arrays {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String ch = in.next();
			if (map.get(ch) == null) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}
		
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			String ch = in.next();
			if (map.get(ch) != null) {
				System.out.println(map.get(ch));
			}else{
				System.out.println(0);
			}

		}
	}

}
