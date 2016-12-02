package Algorithms;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Balanced_Brackets {

	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<Character>();
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		String chain = "({[";
		
		for (int i = 0; i < chain.length(); i++) {
			char c = chain.charAt(i);
			if (c == '(') {
				map.put(c, ')');
			} else {
				if (c == '{') {
					map.put(c, '}');
				} else {
					if (c == '[') {
						map.put(c, ']');
					}
				}
			}
		}

		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			if (map.containsKey(ch)) {
				stack.push(ch);
			} else {
				if (stack.isEmpty()) {
					return false;
				} else {
					if (map.get(stack.peek()) == ch)
						stack.pop();
				}
			}
		}

		if (stack.isEmpty())
			return true;
		return false;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			System.out.println((isBalanced(expression)) ? "YES" : "NO");
		}
	}
}
