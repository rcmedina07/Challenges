package Algorithms;

import java.util.Scanner;

public class The_Maximum_Subarray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String a=null;

	for (int i = 0; i < t; i++) {
			int[] arr = new int[in.nextInt()];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = in.nextInt();
			}
			int cont = 0;
			int notcont = 0;

			int c = arr[0];
			int cmax = arr[0];
			for (int k = 1; k < arr.length; k++) {
				c = Math.max(arr[k], c + arr[k]);
				cmax = Math.max(cmax, c);
				cont = cmax;
			}
			for (int h = 0; h < arr.length; h++) {

				if (arr[h] > 0) {
					notcont = notcont + arr[h];
				}
			}
			if (notcont == 0) {
				notcont = cont;
			}
			System.out.println(cont + " " + notcont);
		}

	}

	public static int[] tasksTypes(int[] deadline, int day) {

		int[] calendar = new int[3];
		int today = 0;
		int upcoming = 0;
		int later = 0;
		for (int i = 0; i < deadline.length; i++) {
			if (deadline[i] <= day) {
				today++;
			} else if (deadline[i] >= day && deadline[i] <= (day + 7)) {
				upcoming++;
			} else {
				later++;
			}
		}
		System.out.println(today + " " + upcoming + " " + " " + later);
		calendar[0] = today;
		calendar[1] = upcoming;
		calendar[2] = later;

		return calendar;
	}

	static String smartAssigning(String[][] information) {
		if ((information[0][1] == "0" && information[1][1] != "0")
				|| (information[0][1].compareTo(information[1][1]) < 0
						&& information[0][2].compareTo(information[1][2]) < 0)
				|| (information[0][1].compareTo(information[1][1]) == 0
						&& information[0][2].compareTo(information[1][2]) < 0)
				|| (information[0][1].compareTo(information[1][1]) < 0
						&& information[0][2].compareTo(information[1][2]) == 0)) {
			return information[1][0];
		} else {
			return information[0][0];
		}
	}
}
