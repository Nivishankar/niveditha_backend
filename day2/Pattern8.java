package patterns;

import java.util.Scanner;

public class Pattern8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		
//		5 4 3 2 1
//		5 4 3 2 1
//		5 4 3 2 1
//		5 4 3 2 1
//		5 4 3 2 1
		
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
