package programms;

import java.util.Scanner;

public class StringOPerations {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		
		if(isPalindrome(str)) {
			System.out.println("Given String is Palindrome");
		}else {
			System.out.println("Given String is not Palindrome");
		}
		
		
		countEachCharacter(str);
		
		System.out.println("Reversed String is: "+reverse(str));
		
		System.out.println("Vowels count is: ");
	}
		
		public static boolean isPalindrome(String str) {
			String rev="";
			for(int i=str.length()-1;i>=0;i--) {
				rev+=str.charAt(i);
			}
			if(str.equalsIgnoreCase(rev)) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public static void countEachCharacter(String str) {
			int[] arr=new int[123];
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				arr[ch]++;
			}
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=0) {
					System.out.println((char)i+"---->"+arr[i]);
				}
			}
		}
		
		public static String reverse(String str) {
			String rev="";
			for(int i=str.length()-1;i>=0;i--) {
				rev+=str.charAt(i);
			}
			return rev;
		}

}
