package programms;

import java.util.Arrays;
import java.util.Scanner;

public class StringOPerations {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.println("Enter String");
		String str1=sc.nextLine();
		
		
		if(isPalindrome(str)) {
			System.out.println("Given String is Palindrome");
		}else {
			System.out.println("Given String is not Palindrome");
		}
		
		
		countEachCharacter(str);
		
		System.out.println("Reversed String is: "+reverse(str));
		
		countVowels(str);
		
		System.out.println("Words count is: "+countWord(str));
		
		if(isPanagram(str)) {
			System.out.println("Given String is Panagram");
		}else {
			System.out.println("Given String is not Panagram");
		}
		
		if(isAnagram(str,str1)) {
			System.out.println("Given String is Anagram");
		}else {
			System.out.println("Given String is not Anagram");
		}
		
		
		System.out.println("All vowels present in a given String: "+isAllVowelsPresent(str));
	}
		
	
	
//	isPalindrome
	
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
		
//		countEachCharacter
		
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
		
//		reverse
		
		public static String reverse(String str) {
			String rev="";
			for(int i=str.length()-1;i>=0;i--) {
				rev+=str.charAt(i);
			}
			return rev;
		}
		
//		countVowels
		
		public static void countVowels(String str) {
			int count=0;
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
					count++;
				}
			}
			System.out.println("Vowels count is: "+count);
		}
		
//		isAllVowelsPresent
		
		public static boolean isAllVowelsPresent(String str) {
			 str=str.toLowerCase();
			 int[] arr=new int[26];
				for(int i=0;i<str.length();i++) {
					arr[str.charAt(i)-97]++;
				}
			return arr[0]>0 && arr[4]>0 && arr[8]>0 && arr[14]>0 && arr[20]>0;
						
		}
		
//		countWord
		
		public static int countWord(String str) {
			String[] strarr=str.split(" ");
			return strarr.length;
		}
		
//		isPanagram
		
		public static boolean isPanagram(String str) {
			str=str.toUpperCase();
			int[] arr=new int[26];
			for(int i=0;i<str.length();i++) {
				arr[str.charAt(i)-65]++;
			}
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==0) {
					return false;
				}
			}
			return true;
		}
		
//		isAnagram
		
		public static boolean isAnagram(String str1,String str2) {
			if(str1.length()!=str2.length()){
				return false;
			}
			char[] ch1=str1.toCharArray();
			char[] ch2=str2.toCharArray();
			 return Arrays.equals(ch1, ch2);
		}

}
