package excelsoftpack;

import java.util.Scanner;

public class Pattern36 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		
		
//		   1
//		  212
//		 32123
//		4321234
//		 32123
//		  212
//		   1

		
		
		int p=n/2+1;
		int q=n/2;
		for(int i=1;i<=p;i++) {
			for(int j=1;j<=p-i;j++) {
				System.out.print(" ");
			}
			int x=i,y=2;
			for(int k=1;k<=2*i-1;k++) {
				if(k<=i+1/2) {
					System.out.print(x--);
				}else {
					
					System.out.print(y++);
				}
				
			}
			System.out.println();
		}
		
		for(int i=q;i>=1;i--) {
			for(int j=q;j>=i;j--) {
				System.out.print(" ");
			}
			int x=i,y=2;
			for(int k=1;k<=2*i-1;k++) {
				if(k<=i+1/2) {
					System.out.print(x--);
				}else {
					
					System.out.print(y++);
				}
				
			}
			System.out.println();
		}
	}
}
