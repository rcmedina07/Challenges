package Algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class Dynamic_Array {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		int lastAns = 0;

		ArrayList<ArrayList<Integer>> seqList = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < n; i++) {
			ArrayList<Integer> tem = new ArrayList<Integer>();
			seqList.add(tem);
		}

		for (int i = 0; i < q; i++) {
			int c = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			int seq = 0;
			int seq2 = 0;

			if (c == 1) {
				seq = ((x ^ lastAns) % n);
				seqList.get(seq).add(y);

			} else {
				if (c == 2) {
					seq = ((x ^ lastAns) % n);
					seq2 = y % seqList.get(seq).size();
					lastAns = seqList.get(seq).get(seq2);
					System.out.println(lastAns);
				}
			}
		}

	}

}
