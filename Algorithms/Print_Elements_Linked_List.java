package Algorithms;

public class Print_Elements_Linked_List {

	class Node {
		int data;
		Node next;
	}

	void Print(Node head) {
		if (head != null) {
			Node h = head;
			while (h != null) {
				System.out.println(h.data);
				h = h.next;
			}
		}
	}
}
