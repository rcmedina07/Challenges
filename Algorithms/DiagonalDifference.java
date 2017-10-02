package Algorithms;

import java.util.Scanner;

public class DiagonalDifference {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        System.out.println(calcDiagonalDifference(a));
    }
    
   public static int calcDiagonalDifference(int a[][]){
	  int primera=0;
	  int segunda=0;
	  
	   int i=0;
	   while(i<a.length){
		   primera= primera+a[i][i];
		   segunda= segunda+a[i][(a.length-1)-i]; 
		   i++;
	   }
	   
	   return Math.abs(primera-segunda);
	   
   }

}
