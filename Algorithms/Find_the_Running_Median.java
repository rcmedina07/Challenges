package Algorithms;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Find_the_Running_Median {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		PriorityQueue<Double> orderMax = new PriorityQueue<Double>(n / 2, Collections.reverseOrder());
		PriorityQueue<Double> orderMin = new PriorityQueue<Double>();

		for (int a_i = 0; a_i < n; a_i++) {
			double elem = in.nextDouble();

			if (orderMax.size() != 0 && elem < orderMax.peek()) {
				orderMax.add(elem);
			} else {
				orderMin.add(elem);
			}

			if (orderMin.size() - orderMax.size() > 1) {
				orderMax.add(orderMin.poll());
			}

			if (orderMax.size() - orderMin.size() > 1) {
				orderMin.add(orderMax.poll());
			}

			if (orderMin.size() == orderMax.size()) {
				System.out.println((orderMin.peek() + orderMax.peek()) / 2);
			} else {
				if (orderMin.size() > orderMax.size()) {
					System.out.println(orderMin.peek());
				} else {
					System.out.println(orderMax.peek());
				}
			}
		}
	}
}
