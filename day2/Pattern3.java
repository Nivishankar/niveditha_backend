package patterns;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		
//		1
//		2 3
//		3 4 5
//		4 5 6 7
//		5 6 7 8 9
		
		for(int i=1;i<=n;i++) {
			int k=i;
			for(int j=1;j<=i;j++) {
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
	}
	
}
