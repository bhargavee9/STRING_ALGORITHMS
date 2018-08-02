/*How to check if two Strings are anagrams of each other?

Two strings are anagrams if they are written using the same exact letters,
ignoring space, punctuation and capitalization. Each letter should have the
same count in both strings. For example, Army and Mary are anagram of each other. 



* USING HASHMAP [TOO LONG]
* USING SORT ***
*/



package com.bhargavee.stringalgos;
import java.util.*;

public class CheckIfAnagram {

	//*************Using HashMap - Too Long ! Nooooo
	public boolean isAnagramusingMap(String input1,String input2) {
		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();
		char[] inputarray1 = input1.toCharArray();
		char[] inputarray2 = input2.toCharArray();
		
		Map<Character,Integer> charmap = new HashMap<>();

		//Populate charmap with input1 details
		for(int i=0;i<input1.length();i++) {
			if(charmap.containsKey(inputarray1[i])) {
				charmap.put(inputarray1[i],charmap.get(inputarray1[i])+1);
				
			}
			
			else {
				charmap.put(inputarray1[i],1);
				
			}
			
		}
		
		//verify with input2 details
		for(int i=0;i<input2.length();i++) {
			if(charmap.containsKey(inputarray2[i]) && charmap.get(inputarray1[i])!=0) {
				charmap.put(inputarray1[i],charmap.get(inputarray1[i])-1);
			}
			else {
				return false;
			}
			
		}
		
		Set<Character> keys = charmap.keySet();
		for(Character key : keys) {
			if(charmap.get(key)!=0)
				return false;
			
		}
		
		
		return true;
		
	}
	
	//Using Sorting technique
	
	public boolean isAnagramusingsort(String input1,String input2) {
		if(input1==null || input2 ==null) return false;
		input1 = input1.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		input2 = input2.toLowerCase();
		char[] input1array = input1.toCharArray();
		char[] input2array = input2.toCharArray();
		Arrays.sort(input1array);
		Arrays.sort(input2array);
		return Arrays.equals(input1array, input2array);
		
		
	}
	


}
