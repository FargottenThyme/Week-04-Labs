package backEndSoftwareDesignHomework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WeekFourLabs2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); // 1.
		for (int i = 0; i <= 9; i++) {
			if (i == 0) {
				sb.append(i);
			} else {
			sb.append(" - " + i);
			}
		}
		System.out.println(sb);
		
		List<String> strList = new ArrayList<String>(); // 2.
		strList.add("Four");
		strList.add("Seven");
		strList.add("Eleven");
		strList.add("Fifteen");
		strList.add("One");
		
		System.out.println(strList);
		System.out.println(shortString(strList));
		System.out.println(firstLastSwap(strList));
		System.out.println(strListConcat(strList));
		System.out.println(keywordAdd(strList, "Number: "));
		
		List<Integer> numsList = new ArrayList<Integer>();
		for (int i = 0; i <= 50; i++) {
			numsList.add(i);
		}
		System.out.println(isListDivisible(numsList));
		System.out.println(stringLengths(strList));
		
		Set<String> strSet = new HashSet<String>(); // 9.
		strSet.add("Water");
		strSet.add("Fire");
		strSet.add("Earth");
		strSet.add("Wind");
		strSet.add("null");
		
		System.out.println(hasLetterInString(strSet, 'W'));
		System.out.println(convertSetToList(strSet));
		
		Set<Integer> numsSet = new HashSet<Integer>();
		for (int i = 0; i <= 50; i++) {
			numsSet.add(i + 1);
		}
		
		System.out.println(evenNumSet(numsSet));
		
		Map<String, String> dictionary = new HashMap<String, String>(); // 13.
		dictionary.put("Person", "A human being regarded as an individual.");
		dictionary.put("Object", "A material thing that can be seen and touched.");
		dictionary.put("Place", "A particular position or point in space.");
		
		System.out.println(definitionLookUp(dictionary, "Place"));
		System.out.println(containsLetter(strList));

	}
	
	public static String shortString(List<String> strList) { // 3. 
		strList.sort((first, second) -> Integer.compare(first.length(), second.length()));
		return strList.get(0);
	}
	
	public static List<String> firstLastSwap(List<String> input) { // 4.
		String temp = input.get(0);
		input.set(0, input.get(input.size() - 1));
		input.set(input.size() - 1, temp);
		return input;
	}
	
	public static String strListConcat(List<String> strList) { // 5.
		String concat = "";
		for (String str : strList) {
			concat += str;
			if (str != strList.get(strList.size()-1)) {
				concat += ",";
			}
		}
		return concat;
	}
	
	public static List<String> keywordAdd(List<String> strList, String str) { // 6. 
		List<String> newStrList = new ArrayList<String>();
		for (int i = 0; i < strList.size(); i++) {
			newStrList.add(i, str + strList.get(i));
		}
		return newStrList;
	}
	
	public static List<List<Integer>> isListDivisible(List<Integer> numList) { // 7.
		List<List<Integer>> isDivisible = new ArrayList<List<Integer>>(4);
		List<Integer> isDivisibleBy2 = new ArrayList<Integer>();
		isDivisible.add(isDivisibleBy2);
		List<Integer> isDivisibleBy3 = new ArrayList<Integer>();
		isDivisible.add(1, isDivisibleBy3);
		List<Integer> isDivisibleBy5 = new ArrayList<Integer>();
		isDivisible.add(2, isDivisibleBy5);
		List<Integer> isNotDivisible = new ArrayList<Integer>();
		isDivisible.add(3, isNotDivisible);
		for (int num : numList ) {
			if (num % 2 == 0) {
				isDivisible.get(0).add(num);
			}
			if (num % 3 == 0) {
				isDivisible.get(1).add(num);
			}
			if (num % 5 == 0) {
				isDivisible.get(2).add(num);
			}
			if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
				isDivisible.get(3).add(num);
			}
		}
		
		return isDivisible;
	}
	
	public static List<Integer> stringLengths(List<String> str) { // 8.
		List<Integer> strLen = new ArrayList<Integer>();
		for (String strTemp : str) {
			strLen.add(strTemp.length());
		}
		return strLen;
	}
	
	public static Set<String> hasLetterInString(Set<String> strSet, char letter) { // 10.
		Set<String> newStrSet = new HashSet<String>();
		for (String str : strSet) {
			if (str.charAt(0) == letter) {
				newStrSet.add(str);
			}
		}
		return newStrSet;
	}
	
	public static List<String> convertSetToList(Set<String> strSet) { // 11.
		List<String> strList = new ArrayList<String>();
		for (String str : strSet) {
			strList.add(str);
		}
		return strList;
	}
	
	public static Set<Integer> evenNumSet(Set<Integer> numSet) { // 12.
		Set<Integer> evenNumSet = new HashSet<Integer>();
		for (int num : numSet) {
			if (num % 2 == 0) {
				evenNumSet.add(num);
			}
		}
		return evenNumSet;
	}
	
	public static String definitionLookUp(Map<String, String> dictionary, String word) { // 14.
		String definition = dictionary.get(word);
		return definition;
	}
	
	public static Map<Character, Integer> containsLetter(List<String> strList) { // 15.
		Map<Character, Integer> doesContainLetter = new HashMap<Character, Integer>();
		int count = 0;
		for (String str : strList) {
			doesContainLetter.put(str.charAt(0), count++);
		}
		return doesContainLetter;
	}
}
