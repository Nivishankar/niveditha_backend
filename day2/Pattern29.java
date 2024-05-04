package excelsoftpack;

import java.util.Scanner;

public class Pattern29 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		
//		543212345
//		 4321234
//		  32123
//		   212
//		    1
		
		
		for(int i=n;i>=1;i--) {
			for(int j=n;j>i;j--) {
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
