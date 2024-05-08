package excelsoftpack;

import java.util.Scanner;

public class Pattern34 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		
//		   1
//		  121
//		 12321
//		1234321
//		 12321
//		  121
//		   1

		
		int y=n/2;
		int z=n/2+1;
		
		for(int i=1;i<=y;i++) {
			for(int j=1;j<=y-i+1;j++) {
				System.out.print(" ");
			}
			int x=0;
			for(int k=1;k<=2*i-1;k++) {
				if(k<=i+1/2) {
					System.out.print(++x);
				}else {
					System.out.print(--x);
				}
				
			}
			System.out.println();
		}
		
		for(int i=z;i>=1;i--) {

			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			int x=0;
			for(int k=1;k<=2*i-1;k++) {
				if(k<=i+1/2) {
					System.out.print(++x);
				}else {
					System.out.print(--x);
				}
				
			}
			System.out.println();
			
		}
				
	}
}
