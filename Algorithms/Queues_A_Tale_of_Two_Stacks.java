package Algorithms;

import java.util.Scanner;
import java.util.Stack;

public class Queues_A_Tale_of_Two_Stacks {
	public static class MyQueue<T> {
		Stack<T> stackNewestOnTop = new Stack<T>();
		Stack<T> stackOldestOnTop = new Stack<T>();

		public void enqueue(T value) { // Push onto newest stack
			stackNewestOnTop.push(value);
		}

		public T peek() {
			T result = null;
			if (!stackOldestOnTop.isEmpty()) {
				result = stackOldestOnTop.peek();
			} else {
				if (stackNewestOnTop.size() == 1) {
					result = stackNewestOnTop.peek();
				} else {
					while (!stackNewestOnTop.isEmpty()) {
						stackOldestOnTop.push(stackNewestOnTop.pop());
					}
					result = stackOldestOnTop.peek();
				}
			}

			return result;
		}

		public T dequeue() {
			T result = null;
			if (!stackOldestOnTop.isEmpty()) {
				result = stackOldestOnTop.pop();
			} else {
				if (stackNewestOnTop.size() == 1) {
					result = stackNewestOnTop.pop();
				} else {
					while (!stackNewestOnTop.isEmpty()) {
						stackOldestOnTop.push(stackNewestOnTop.pop());
					}
					result = stackOldestOnTop.pop();
				}
			}

			return result;
		}
	}

	public static void main(String[] args) {
		MyQueue<Integer> queue = new MyQueue<Integer>();

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int operation = scan.nextInt();
			if (operation == 1) { // enqueue
				queue.enqueue(scan.nextInt());
			} else if (operation == 2) { // dequeue
				queue.dequeue();
			} else if (operation == 3) { // print/peek
				System.out.println(queue.peek());
			}
		}
		scan.close();
	}
}
