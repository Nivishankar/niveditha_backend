package patterns;

import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		
//		a a a a a
//		b b b b b
//		c c c c c
//		d d d d d
//		e e e e e
//		
		for(int i=97;i<=(n+96);i++) {
			for(int j=97;j<=(n+96);j++) {
				System.out.print((char)i+" ");
			}
			System.out.println();
		}
	}
}
