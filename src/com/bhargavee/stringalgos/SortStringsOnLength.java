/* SORT A GIVEN ARRAY of STRINGS BASED ON THEIR LENGTH */
package com.bhargavee.stringalgos;
import java.util.Arrays;
import java.util.Comparator;

public class SortStringsOnLength {

	public String[] sortStrings(String[] input) {
		
		Comparator<String> lengthComparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length()-o2.length();
			}
			
		};
		
		Arrays.sort(input, lengthComparator);
	    return input;	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortStringsOnLength sol = new SortStringsOnLength();
		String[] input = {"bhargu","hi","World"};
		sol.sortStrings(input);
		for(int i=0;i<input.length;i++)
		 System.out.println(input[i]);
		
	}

}
