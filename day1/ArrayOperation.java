package excelSoft;

import java.util.Scanner;

public class ArrayOperation {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int number[] = new int[5];
		int values[] = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < number.length; i++) {
			number[i] = (i + 1);
		}
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]);
		}
		System.out.println();
		System.out.println("*****************************");

		int[] arr=createArray();

		printArray(createArray());

		int[] newArr=reverseArray();
		printArray(newArr);

		int[] ascArr=ascSort(createArray());
		printArray(ascArr);

		int[] descArr=descSort(createArray());
		printArray(descArr);

		int[] merArr = mergeArray(createArray(),createArray());
		printArray(merArr);

		int[] ziagArr=zigZagArray(createArray(),createArray());
		printArray(ziagArr);
		
		System.out.println("Maximum Element is: "+maxElement(createArray()));
		
		System.out.println("Minimum Element is: "+minElement(createArray()));
		
		int[] uniArr=unionArray(createArray(),createArray());
		printArray(uniArr);

		int[] interArr=intersectionArray(createArray(),createArray());
		printArray(interArr);
		
		int[] remDupli=printDuplicates(createArray());
		printArray(remDupli);
		
		int countPrime=countPrimeNum(createArray());
		System.out.println("Count of Prime Numbers: "+countPrime);

	}
//Creating Array
	
	static int[] createArray() {
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the values");
		for (int j = 0; j < arr.length; j++) {
			arr[j] = sc.nextInt();
		}
		return arr;
	}

//	Print Array
	static void printArray(int[] arr) {
		System.out.println("Printing an Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

//	Reverse Array
	static int[] reverseArray() {
		int[] arr = createArray();
		int[] newArr = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			newArr[j++] = arr[i];
		}
		return newArr;
	}
	
//Ascending Order
	static int[] ascSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		return arr;

	}

//	descending Order
	static int[] descSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		return arr;

	}

//	Merge Array
	static int[] mergeArray(int[] arr1,int[] arr2) {
		int[] arr3 = new int[(arr1.length + arr2.length)];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		int k = arr1.length;
		for (int i = 0; i < arr2.length; i++) {
			arr3[k++] = arr2[i];
		}
		return arr3;
	}

//	ZigZag Array
	static int[] zigZagArray(int[] arr1,int[] arr2) {
		int[] arr3 = new int[(arr1.length + arr2.length)];
		int j=0;
		int k=0;
		for(int i=0;i<arr3.length;i++) {
			if(i%2==0) {
				arr3[i]=arr1[j++];
			}
			else {
				arr3[i]=arr2[k++];
			}
		}
		return arr3;
	}
	
//	MaxElement
	static int maxElement(int[] arr) {
		int[] arr1=ascSort(arr);
		return arr1[arr1.length-1];
	}
	
//	MinElememnt
	static int minElement(int[] arr) {
		int[] arr1=ascSort(arr);
		return arr1[0];
	}
	
//	Union Array
	static int[] unionArray(int[] arr1,int[] arr2) {
		int[] arr3=new int[arr1.length+arr2.length];
//		int k=arr1.length;
//		boolean bool=false;
//		for(int i=0;i<arr1.length;i++) {
//			arr3[i]=arr1[i];	
//		}
//		for(int j=0;j<arr2.length;j++) {
//			for(int p=0;p<arr1.length;p++) {
//			if(arr2[j]==arr1[p]) {
//				bool=true;
//				break;
//			}
//			}
//			if(!bool) {
//			arr3[k]=arr2[j];
//			k++;
//			}
//		}
		int i= 0,j = 0,k = 0,count=0;
		
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] == arr2[j]) {
				arr3[k++] = arr1[i++];
				j++;
			} else if(arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
			} else {
				arr3[k++] = arr2[j++];
			}
		}
		while(i < arr1.length) {
			arr3[k++] = arr1[i++];
		}
		while(j < arr2.length) {
			arr3[k++] = arr2[j++];
		}
		for(int p=0;p<arr3.length;p++) {
			if(arr3[p]==0)
			count++;
		}
		int[] uArr=new int[arr3.length-count];
		for(int q=0;q<uArr.length;q++) {
			uArr[q]=arr3[q];
		}
		return ascSort(uArr);
	}
	
//	Intersection Array

	static int[] intersectionArray(int[] arr1,int[] arr2) {
		int k=0,count=0;
		int[] arr3=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
			if(arr1[i]==arr2[j]) {
				arr3[k++]=arr1[i];
				break;
			}
			}
			
		}
		for(int p=0;p<arr3.length;p++) {
			if(arr3[p]==0)
			count++;
		}
		int[] iArr=new int[arr3.length-count];
		for(int q=0;q<iArr.length;q++) {
			iArr[q]=arr3[q];
		}

		return iArr;
	}
	
//	Print Duplicates
	static int[] printDuplicates(int[] arr) {
		int[] rArr=new int[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					rArr[i]=arr[i];
				}
			}
		}
		for(int p=0;p<rArr.length;p++) {
			if(rArr[p]==0)
			count++;
		}
		int[] iArr=new int[rArr.length-count];
		for(int q=0;q<iArr.length;q++) {
			iArr[q]=rArr[q];
		}
			return iArr;
	}
	
//	Count PrimeNumber
	static int countPrimeNum(int[] arr) {
		int count=0;
		boolean bool=true;
		for(int i=0;i<arr.length;i++) {
			for(int j=2;j<arr[i];j++) {
				if(arr[i]%j==0) {
					bool=false;
					break;
				}
			}
			if(bool) {
				count++;
			}
		}
		return count;
	}
	
	
}
