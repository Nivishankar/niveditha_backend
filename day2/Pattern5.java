package patterns;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		
//		1,1 2,1 3,1 4,1 5,1
//		1,2 2,2 3,2 4,2 5,2
//		1,3 2,3 3,3 4,3 5,3
//		1,4 2,4 3,4 4,4 5,5
//		1,5 2,5 3,5 4,5 5,5

		for(int j=1;j<=n;j++) {
				System.out.print("1"+","+j+" "+"2,"+j+" "+"3,"+j+" "+"4,"+j+" "+"5,"+j);
				System.out.println();

			}

	}
}
