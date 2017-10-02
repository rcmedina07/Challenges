package Algorithms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class The_Love_Letter_Mystery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < t; i++) {
			String cadena = sc.nextLine();
			int res = 0;

			Stack<Character> pila = new Stack<Character>();
			Queue<Character> cola = new LinkedList<Character>();

			int j = 0;
			while (j < cadena.length()) {

				pila.push(cadena.charAt(j));
				cola.add(cadena.charAt(j));
				j++;
			}
			while  (!pila.isEmpty() && !cola.isEmpty()) {
				if (pila.peek() != cola.peek()) {
					res = res + Math.abs(pila.pop() - cola.poll());
					} else {
					pila.pop();
					cola.poll();
				}

			}
			System.out.println(res/2);
		}

	}

}
