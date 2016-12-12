package Algorithms;

import java.util.HashMap;
import java.util.Scanner;

public class Trie {

	public class TrieNode {
		private HashMap<Character, TrieNode> children;
		boolean isWord;
		int cantWord;

		public TrieNode() {
			children = new HashMap<Character, TrieNode>();
			isWord = false;
			cantWord = 0;
		}
	}

	public final TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	public void insert(String word) {
		insert(root, word, 0);
	}

	public void insert(TrieNode n, String w, int i) {
		if (i == w.length()) {
			n.isWord = true;
			return;
		}
		char c = w.charAt(i);
		TrieNode no = n.children.get(c);
		if (no == null) {
			no = new TrieNode();
			n.children.put(c, no);
		}
		no.cantWord++;
		insert(no, w, i + 1);
	}

	public int find(String prefix) {
		return find(root, prefix, 0);
	}

	public int find(TrieNode current, String w, int i) {
		if (i == w.length()) {
			return current.cantWord;
		}

		char c = w.charAt(i);
		TrieNode n = current.children.get(c);
		if (n != null) {
			return find(n, w, i + 1);
		}
		return 0;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Trie t = new Trie();

		for (int a0 = 0; a0 < n; a0++) {
			String op = in.next();
			String contact = in.next();
			if (op.equals("add")) {
				t.insert(contact);
			} else {
				if (op.equals("find")) {
					System.out.println(t.find(contact));
				}
			}
		}
	}

}
