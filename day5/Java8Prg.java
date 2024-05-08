package streams;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Prg {

	public static void main(String[] args) {
		
		//separate odd and even numbers
		separateOddEven();
		
		//Sort list in reverseOrder
		sortReverseOrder();
		
		//Frequency of each character in a string
		frequencyofChar();
		
	// multipleof5
		multiplesof5();
	
	//merge two unsorted array into single sorted array
	twountosinglesort();
	
	//merge two unsorted array into single sorted array without duplicates
	twountosinglesortwithoutduplicates();
	
	//three max & min numbers from list
	threeMinMaxNumber();
	
	//sort String in increasing order with their length
	sortStringIncreasingOrder();

	//sum & average of all elements in array
	sumandAvgAllElements();
	
	//reverse Integer array
	reverseArray();
	
	//palindrome
	palindrome();
	
	//last element of an array
	lastEleArr();
	
	//Age of person in year
	ageofPersonYr();
	
	//remove duplicates in list
	removeDuplicates();
	
	//frequency of each element in an array
	freqEleArr();
	
	//join list of strings with prefix,suffix and delimeter
	joinString();
	
	//max and min of list
	maxMinList();
	
	//sum of all digits in a number
	sumOfDigit();
	
	//find second largest element in an array
	secondlarEle();
	
	//common elements between two array
	commonelements();
	
	//reverse each word of string
	revString();
	
	//sum of first 10 natural numbers
	sumNatural();
	
	//find String starts with number
	numberString();
	
	//find duplicates elements from an array
	  duplicateEle();
	  
	  //fibonacci series
	  fibSeries();
	}

	static void separateOddEven() {
		List<Integer> list=Arrays.asList(2,5,1,6,8,3);
		Map<Boolean, List<Integer>> sOddEven=list.stream().collect(Collectors.partitioningBy(i->i%2==0));
		Iterator<Entry<Boolean,List<Integer>>> itr=sOddEven.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Boolean,List<Integer>> ent=itr.next();
			System.out.println(ent.getKey()+" "+ent.getValue()+" ");
		}
//		for(Entry<Boolean,List<Integer>> it:sOddEven.entrySet()) {
//			System.out.println(it.getKey()+" "+it.getValue());
//		}	
		System.out.println();

	}
	
	
	static void sortReverseOrder() {
		List<Integer> list=Arrays.asList(2,5,1,6,8,3);
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);	
		System.out.println();
	}
	
	static void frequencyofChar() {
		String str="i am a java developer";
		System.out.println(str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		System.out.println();
	}
	
	static void multiplesof5() {
		List<Integer> list=Arrays.asList(2,5,1,60,8,35);
		list.stream().filter(x->x%5==0).forEach(x->System.out.print(x+" "));
		System.out.println();
	}
	
	static void twountosinglesort() {
		int[] arr1= {1,8,3,5,6};
		int[] arr2= {2,9,4,7,10};
		int[] sortedArr=IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
		for(int i=0;i<sortedArr.length;i++) {
			System.out.print(sortedArr[i]+" ");
		}
		System.out.println();

	}
	
	static void twountosinglesortwithoutduplicates() {
		int[] arr1= {1,8,3,1,6};
		int[] arr2= {2,7,4,7,8};
		int[] sortedArr=IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().distinct().toArray();
		for(int i=0;i<sortedArr.length;i++) {
			System.out.print(sortedArr[i]+" ");
		}
		System.out.println();
	}
	
	static void threeMinMaxNumber() {
		List<Integer> list=Arrays.asList(2,5,1,60,8,35);
		System.out.println("Minimum numbers");
		list.stream().sorted().limit(3).forEach(System.out::print);
		System.out.println();
		System.out.println("Minimum numbers");
		list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::print);
		System.out.println();
	}
	
	static void sortStringIncreasingOrder() {
		List<String> strlist=Arrays.asList("webtechnology","corejava","advancejava","hibernate");
		strlist.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	}
	
	static void sumandAvgAllElements() {
		int[] arr= {1,8,3,5,6};
		int sum=Arrays.stream(arr).sum();
		System.out.println("sum of elements: "+sum);
		
		double avg=Arrays.stream(arr).average().getAsDouble();
		System.out.println("Average of elements: "+avg);

	}
	
	static void reverseArray() {
		int[] arr= {1,8,3,5,6};
		int[] revArr=IntStream.rangeClosed(1, arr.length).map(i->arr[arr.length-i]).toArray();
		for(int i=0;i<revArr.length;i++) {
			System.out.print(revArr[i]+" ");
		}
		System.out.println();
	}
	
	static void palindrome() {
		String str="madam";
		if(IntStream.range(0, str.length()/2).noneMatch(i->str.charAt(i)!=str.charAt(str.length()-i-1))) {
			System.out.println("Given string is palindrome");
		}
		else {
			System.out.println("Given String is not a palindrome");
		}
	}
	
	static void lastEleArr() {
		List<String> strlist=Arrays.asList("webtechnology","corejava","advancejava","hibernate");
		String lastEle=strlist.stream().skip(strlist.size()-1).findFirst().get();
		System.out.println(lastEle);
	}
	
	static void ageofPersonYr() {
		LocalDate birthday=LocalDate.of(1998,07,23);
		LocalDate today=LocalDate.now();
		System.out.println(ChronoUnit.YEARS.between(birthday, today));
	}
	
	static void removeDuplicates() {
		List<String> strlist=Arrays.asList("webtechnology","corejava","webtechnology","hibernate","hibernate");
		List<String> remStr=strlist.stream().distinct().collect(Collectors.toList());
		System.out.println(remStr);

	}
	
	static void freqEleArr() {
		String[] strArr= {"hello","hi","java","css","hi","inheritance","hello"};
		System.out.println(Arrays.stream(strArr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
	}
	
	static void joinString() {
		List<String> strlist=Arrays.asList("webtechnology","corejava","advancejava","hibernate");
		String str=strlist.stream().collect(Collectors.joining("Delimiter","Prefix","Suffix"));
		System.out.println(str);
	}
	
	static void maxMinList() {
		List<Integer> list=Arrays.asList(2,5,1,60,8,35);
		System.out.println("Maximum element: "+ list.stream().max(Comparator.naturalOrder()).get());
		System.out.println("Minimum element: "+ list.stream().min(Comparator.naturalOrder()).get());

	}
	
	static void sumOfDigit() {
		int number=4576816;
		long sum=Stream.of(String.valueOf(number).split("")).collect(Collectors.summarizingInt(Integer::parseInt)).getSum();
		System.out.println("Sum of digits: "+sum);
	}
	
	static void secondlarEle() {
		int[] arr= {1,8,3,5,6};
		int secEle=IntStream.of(arr).sorted().skip(arr.length-2).findFirst().getAsInt();
		System.out.println(secEle);

	}
	
	static void commonelements() {
		List<Integer> list1=Arrays.asList(6,3,8,2,5);
		List<Integer> list2=Arrays.asList(2,5,1,60,8,35);
		list1.stream().filter(list2::contains).forEach(System.out::print);
		System.out.println();
		}
	
	static void revString() {
		String str="java developer";
		String revStr=Arrays.stream(str.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
		System.out.println("Reverse String :"+revStr);
	}
	
	static void sumNatural() {
		int sum=IntStream.range(1, 11).sum();
		System.out.println("sum first 10 natural numbers :"+sum);
	}
	
	static void numberString() {
		List<String> strlist=Arrays.asList("3webtechnology","1corejava","advancejava","4hibernate");
		strlist.stream().filter(str->Character.isDigit(str.charAt(0))).forEach(System.out::print);
		System.out.println();
	}
	
	static void duplicateEle() {
		HashSet<Integer> set = new HashSet<Integer>();
		List<Integer> list=Arrays.asList(2,5,1,2,8,6,9,4,5,8);
		list.stream().filter(i->!set.add(i)).collect(Collectors.toSet());
		System.out.println(set);
	}
	
	static void fibSeries() {
		
		System.out.print("Fibonacci Series:");
		Stream.iterate(new int[] {0,1}, f->new int[] {f[1],f[0]+f[1]}).limit(10).map(f->f[0]).forEach(x->System.out.print(x+" "));
	}
}
