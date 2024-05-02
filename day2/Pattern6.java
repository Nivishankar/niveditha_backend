package patterns;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		
//		A B C D E
//		A B C D E
//		A B C D E
//		A B C D E
//		A B C D E
		
		for(int i=1;i<=n;i++) {
			for(int j=65;j<=(n+64);j++) {
				System.out.print((char)j+" ");
			}
			System.out.println();
		}
	}
}
