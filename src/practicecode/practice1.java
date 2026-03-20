package practicecode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class practice1 {
	
//	public static boolean checkUnique(String str) {
//		
//		HashSet<Character> set = new HashSet<>();
//		
//		for(Character ch : str.toCharArray()) {
//			if(!set.add(ch)) {
//				return false;
//			}
//		}
//		
//		return true;
//		
//	}
//	
	
//	public static boolean checkContainsOnlyDigits(String str) {
//		
//		for(Character ch : str.toCharArray()) {
//			if(!Character.isDigit(ch)) {
//				return false;
//			}
//		}
//		
//		return true;
//	}
//	
	
//	public static void countFrequency(String str) {
//		LinkedHashMap<Character , Integer> map = new LinkedHashMap<>();
//		
//		for(Character ch : str.toCharArray()) {
//			map.put(ch, map.getOrDefault(ch , 0) + 1);
//		}
//		
//		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " : "  + entry.getValue() );
//		}
//	}
	
	
//	public static void countTheWord(String str) {
//		
//		
//		String []word = str.toLowerCase().split("\\s+");
//		
//		LinkedHashMap<String , Integer> map1 = new LinkedHashMap<>();
//		
//		for(String str1 : word) {
//			map1.put(str1, map1.getOrDefault(str1, 0) + 1);
//		}
//		
//		for(Map.Entry<String ,Integer> entry : map1.entrySet()) {
//			System.out.println(entry.getKey() + ": " + entry.getValue()) ;
//		}
//	}
	
//	public static int countWords(String str) {
//		if(str == null) {
//			return 0;
//		}
//		
//		return str.trim().split("\\s+").length;
//	}
	
	
//	public static void countVandC(String str) {
//		
//		int vowel = 0 ;
//		int consonent = 0;
//		
//		for(Character ch : str.toCharArray()) {
//			if(Character.isLetter(ch)) {
//				if("aeiou".indexOf(ch) != -1) {
//					vowel++;
//				}else {
//					consonent++;
//				}
//			}
//		}
//		System.out.println("vowels : " + vowel + "  consonents : " + consonent);
//	}
	
	
//	public static boolean checkPalindrom(String str) {
//		str = str.toLowerCase();
//		String rev = "";
//		
//		for(int i = str.length() - 1 ; i >= 0 ; i--) {
//			rev = rev + str.charAt(i);
//		}
//		
//		return str.equals(rev);
//	}
	
//	public static void printEvenLengthWord(String str) {
//		String []word = str.toLowerCase().split("\\s+");
//		
//		for(String s : word) {
//			if(s.length()%2 == 0) {
//				System.out.print(s + " ");
//			}
//		}
//	}
//	
//	
//	public static void noneDuplicateElement(String str) {
//		
//		for(int i = 0 ; i <= str.length() ; i++) {
//			char ch = str.charAt(i);
//			
//			if(str.indexOf(ch) == str.lastIndexOf(ch)) {
//				System.out.println(ch);
//			}
//		}
//		
//	}
//	
//	public static String reverseVowel(String str) {
//		
//		Set<Character> vowels = new HashSet<>(Arrays.asList(
//				'a' , 'e' ,'i','o','u',
//				'A' , 'E' ,'I' ,'O' ,'U'
//				));
//		
//		char[] chars = str.toCharArray();
//		int left = 0 ;
//		int right = chars.length-1;
//		
//		
//		while(left < right ) {
//			
//			while(left < right &&  !vowels.contains(chars[left])) {
//				left++;
//			}
//			
//			while(left < right &&  !vowels.contains(chars[right])) {
//				right--;
//			}
//			
//			char temp = chars[left];
//			chars[left] = chars[right];
//			chars[right] = temp;
//			
//			left++;
//			right--;
//			
//		}
//		return new String(chars);
//	}
	
//	public static boolean stringRotateCheck(String str , String goal) {
//		if(str.length() != goal.length()) {
//			return false;
//		}
//		
//		String combine = str + str;
//		return combine.contains(goal);
//	}
	
	
//	public static void anagramCheck(String s1 , String s2) {
//		
//		char[] arr1 = s1.toCharArray();
//		char[] arr2 = s2.toCharArray();
//		
//		Arrays.sort(arr1);
//		Arrays.sort(arr2);
//		
//		System.out.println(Arrays.equals(arr1, arr2));
//	}
//	
	
//	public static int lengthOfLastWorld(String str) {
//		int length = 0 ;
//		int i = str.length() - 1;
//		
//		while(i >= 0 && str.charAt(i) == ' ') {
//			i--;
//		}
//		
//		while(i >= 0 && str.charAt(i) != ' '){
//			length++;
//			i--;
//		}
//		
//		return length;
//	}
	
//	public static void secondLargest(int[] arr) {
//		int first = Integer.MIN_VALUE;
//		int second = Integer.MIN_VALUE;
//		
//		for(int num : arr) {
//			if(num > first) {
//				second = first;
//				first = num;
//			}else if(num > second && num != first) {
//				second = num;
//			}
//		}
//		
//		System.out.println(second);
//	}
	
//	public static void missingNumber() {
//		int arr[] = {1,2,4,5};
//		int n = 5;
//		int expectedSum = n * (n +1) /2;
//		int actualSum = 0;
//		
//		for(int i : arr) {
//			actualSum += i;
//		}
//		
//		System.out.println(expectedSum - actualSum);
//		
//	}
//	
	
	
	
	
	public static void main(String []args) {
		String str = "icecream";
		
//		System.out.println(checkUnique(str));
//		System.out.println(checkContainsOnlyDigits(str));
//		countFrequency(str);
		
//		countTheWord(str);
//		System.out.println(countWords(str));
		
//		countVandC(str);
		
//		System.out.println(checkPalindrom(str));
//		printEvenLengthWord(str);
//		noneDuplicateElement(str);
//		System.out.println(reverseVowel(str));
		
//		System.out.println(stringRotateCheck("abcde" , "cdeab"));
		
//		anagramCheck("listen" , "silent");
//		System.out.println(lengthOfLastWorld("hello world"));
//		int arr[] = {1,2,3,4,5,6,7,8};
//		secondLargest(arr);
		
//		missingNumber();
	}

}
