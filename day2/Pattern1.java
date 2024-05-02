package patterns;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		
		//1 1 1 1 1
				//2 2 2 2 2
				//3 3 3 3 3
				//4 4 4 4 4
				//5 5 5 5 5
				
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						System.out.print(i+" ");
					}
					System.out.println();
				}

	}
}
