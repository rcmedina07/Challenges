package Algorithms;

import java.util.Scanner;
import java.util.Stack;

public class Maximum_Element {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Stack<Integer> p = new Stack<Integer>();
		Stack<Integer> px = new Stack<Integer>();

		for (int i = 0; i < n; i++) {
			int t = in.nextInt();
			if (t == 1) {
				int x = in.nextInt();
				if (p.isEmpty()) {
					p.push(x);
					px.push(x);
				} else {
					p.push(x);
					if (px.peek() < p.peek()) {
						px.push(p.peek());
					} else {
						px.push(px.peek());
					}
				}
			} else if (t == 2) {
				p.pop();
				px.pop();

			} else {
				System.out.println(px.peek());
			}
		}
	}

}
