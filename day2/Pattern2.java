package patterns;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		
//		1 2 3 4 5
//		1 2 3 4 5
//		1 2 3 4 5
//		1 2 3 4 5
//		1 2 3 4 5

		for(int i=1;i<=n;i++) {
			int j=1;
			while(j<=n) {
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
		}
	}
}
