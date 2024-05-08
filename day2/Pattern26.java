package excelsoftpack;

import java.util.Scanner;

public class Pattern26 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		
//		    A
//		   ABA
//		  ABCBA
//		 ABCDCBA
//		ABCDEDCBA
		
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			int x=64;
			for(int k=1;k<=2*i-1;k++) {
				if(k<=i+1/2) {
					System.out.print((char)++x);
				}else {
					System.out.print((char)--x);
				}
				
			}
			System.out.println();
		}
	}
}
