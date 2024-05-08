package excelsoftpack;

import java.util.Scanner;

public class Pattern25 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		
//		    1
//		   1*2
//		  1*2*3
//		 1*2*3*4
//		1*2*3*4*5
		
		
		
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			int x=1;

			for(int k=1;k<=2*i-1;k++) {
				if(k%2==0) {
					System.out.print("*");
				}else {
					System.out.print(x++);
				}
			}
			System.out.println();
		}
	}
	
}
