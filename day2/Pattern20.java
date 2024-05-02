package patterns;

import java.util.Scanner;

public class Pattern20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		
//		    1
//		   21
//		  321
//		 4321
//		54321
		
		
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			int x=i;
			for(int k=1;k<=i;k++) {
				System.out.print(x--);
			}
			System.out.println();
			
		}

	}
}
