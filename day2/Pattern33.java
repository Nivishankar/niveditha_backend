package excelsoftpack;

import java.util.Scanner;

public class Pattern33 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		
//		*******
//		*  *  *
//		*  *  *
//		*******
//		*  *  *
//		*  *  *
//		*******

		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((j==1 || j==n) || (i==1 || i==n) || (i==n/2+1 || j==n/2+1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
