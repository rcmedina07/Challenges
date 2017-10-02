package Algorithms;

import java.util.ArrayList;
import java.util.Hashtable;

public class Linked_List_Algorithms {

	class Node {
		int data;
		Node next;
	}

	Node InsertTrail(Node head, int data) {
		Node aux = new Node();
		aux.data = data;
		if (head == null) {
			head = aux;
			head.next = null;
		} else {
			Node h = head;
			while (h.next != null) {
				h = h.next;
			}
			h.next = aux;
		}

		return head;
	}

	Node InsertHead(Node head, int x) {
		Node aux = new Node();
		aux.data = x;
		if (head == null) {
			head = aux;
			head.next = null;
		} else {
			aux.next = head;
		}

		return aux;
	}

	Node InsertNth(Node head, int data, int position) {
		Node aux = new Node();
		aux.data = data;

		if (head == null) {
			head = aux;
		} else {
			if (position == 0) {
				aux.next = head;
				head = aux;

			} else {
				Node h = head;
				for (int i = 0; i < position - 1; i++) {
					h = h.next;
				}
				aux.next = h.next;
				h.next = aux;
			}
		}
		return head;
	}

	Node Delete(Node head, int position) {
		if (head != null) {
			if (position == 0) {
				head = head.next;
			} else {
				Node aux = new Node();
				Node h = head;
				for (int i = 0; i < position - 1; i++) {
					h = h.next;
				}
				aux = h.next;
				h.next = aux.next;
			}
		}
		return head;
	}

	void ReversePrint(Node head) {
		ArrayList<Integer> aux = new ArrayList<Integer>();

		if (head != null) {
			Node h = head;
			while (h != null) {
				aux.add(h.data);
				h = h.next;
			}
			for (int i = aux.size() - 1; i >= 0; i--) {
				System.out.println(aux.get(i));
			}

		}
	}

	Node Reverse(Node head) {
		ArrayList<Integer> aux = new ArrayList<Integer>();
		if (head != null) {
			Node h = head;
			while (h != null) {
				aux.add(h.data);
				h = h.next;
			}
			h = head;
			for (int i = aux.size() - 1; i >= 0; i--) {
				h.data = aux.get(i);
				h = h.next;
			}
		}
		return head;
	}

	int CompareLists(Node headA, Node headB) {
		if (headA != null && headB != null) {
			Node a = headA;
			Node b = headB;
			while (a.next != null) {
				if (a.data == b.data) {
					a = a.next;
					b = b.next;
				} else {
					return 0;
				}
			}
			if (b.next == null) {
				if (a.data == b.data) {
					return 1;
				} else {
					return 0;
				}
			}
		}
		return 0;
	}

	Node MergeLists(Node headA, Node headB) {
		Node head = new Node();
		Node aux = null;
		Node p = null;

		Node a = headA;
		Node b = headB;
		aux = head;
		while (a != null && b != null) {
			aux.next = new Node();
			if (a.data < b.data) {
				aux.data = a.data;
				p = aux;
				aux = aux.next;
				a = a.next;
			} else {
				aux.data = b.data;
				p = aux;
				aux = aux.next;
				b = b.next;
			}
		}
		if (a != null) {
			while (a != null) {
				aux.next = new Node();
				aux.data = a.data;
				p = aux;
				aux = aux.next;
				a = a.next;
			}
		} else {
			if (b != null) {
				while (b != null) {
					aux.next = new Node();
					aux.data = b.data;
					p = aux;
					aux = aux.next;
					b = b.next;
				}
			}

		}
		p.next = null;
		return head;
	}

	Node RemoveDuplicates(Node head) {
		if (head != null) {
			Node h = head;
			Node aux;
			while (h.next != null) {
				if (h.data == h.next.data) {
					aux = h.next;
					h.next = aux.next;
				}
				h = h.next;
			}
		}
		return head;
	}

	int GetNode(Node head, int n) {
		Node h = head;
		if (head != null) {
			int c = 0;
			while (h != null) {
				h = h.next;
				c++;
			}
			int i = 0;
			h = head;
			while (i < c - n - 1) {
				h = h.next;
				i++;
			}
		}
		return h.data;
	}

	boolean hasCycle(Node head) {
		Hashtable<Node, Integer> m = new Hashtable<Node, Integer>();
		if (head != null) {
			Node h = head;
			while (h != null) {
				if (m.get(h) == null) {
					m.put(h, 1);
					h = h.next;
				} else {
					return true;
				}
			}

		} else {
			return false;
		}
		return false;
	}

}
