package patterns;

import java.util.Scanner;

public class Pattern19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		
//		*********
//		 *******
//		  *****
//		   ***
//		    *
		
		for(int i=5;i>=1;i--) {
			
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
			
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			
		}

	}
}
