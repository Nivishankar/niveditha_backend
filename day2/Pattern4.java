package patterns;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		
		
//		1 0 1 0 1
//		1 0 1 0 1
//		1 0 1 0 1
//		1 0 1 0 1
//		1 0 1 0 1
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j%2!=0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
		}	
	}
}
