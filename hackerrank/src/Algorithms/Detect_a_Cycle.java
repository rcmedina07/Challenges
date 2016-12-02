package Algorithms;

import java.util.HashMap;

public class Detect_a_Cycle {

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

	}

	boolean hasCycle(Node head) {
		HashMap<Node, Boolean> lista = new HashMap<Node, Boolean>();
		Node aux = head;

		while (aux != null) {
			if (lista.containsKey(aux))
				return true;
			lista.put(aux, false);
			aux = aux.next;
		}
		return false;
	}

}
