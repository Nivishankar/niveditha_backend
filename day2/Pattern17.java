package patterns;

import java.util.Scanner;

public class Pattern17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();

//		    1
//		   123
//		  12345
//		 1234567
//		123456789
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
