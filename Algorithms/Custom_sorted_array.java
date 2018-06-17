package Algorithms;

import java.util.Scanner;

public class Custom_sorted_array {
    public static int moves(int[] a) {
        int result = 0;
        int ini = 0;
        int fin = a.length - 1;

        while (ini < fin) {
            while ((a[ini] % 2 == 0) && ini < fin) {
                ini++;
            }

            while ((a[fin] % 2 != 0) && ini < fin) {
                fin--;
            }

            if (ini < fin) {
                result++;
                ini++;
                fin--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] arr = new int[t];
        for (int a0 = 0; a0 < t; a0++) {
            int elem = in.nextInt();
            arr[a0] = elem;
        }
        System.out.println(moves(arr));

    }

}
