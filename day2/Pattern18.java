package patterns;

import java.util.Scanner;

public class Pattern18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		
//		    1
//		   010
//		  10101
//		 0101010
//		101010101
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				if(i%2!=0) {
				if(k%2!=0) {
				System.out.print("1");
				}
				else {
					System.out.print("0");
				}
				}else {
					if(k%2!=0) {
						System.out.print("0");
						}
						else {
							System.out.print("1");
						}
				}
			}
			System.out.println();
			
		}
		
	}
}
