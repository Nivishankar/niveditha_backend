package excelsoftpack;

import java.util.Scanner;

public class Pattern24 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		
//		    5
//		   454
//		  34543
//		 2345432
//		123454321
		
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			int x=n-i+1,y=4;

			for(int k=1;k<=2*i-1;k++) {

				if(k<=i+1/2) {
					System.out.print(x++);
				}else {
					
					System.out.print(y--);
				}
				
			}
		
			System.out.println();
		}
	}
}
