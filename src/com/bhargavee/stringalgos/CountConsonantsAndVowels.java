//Count number of vowels and consonants 
// Ask Interviewer if the string contains any special character or 
// any nonsense other than vowels and consonants

package com.bhargavee.stringalgos;


public class CountConsonantsAndVowels {

	public int[] Count(String s) {
		int[] result = new int[2];
		result[0]=0;
		char[] sarray = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			switch(s.charAt(i)) {
			case 'a'|'A':
			case 'e'|'E':
			case 'i'|'I':
			case 'o'|'O':
			case 'u'|'U':result[0]++;
			
			
			}
			
		}
		
		result[1] = s.length()-result[0];
		return result;
		
	}
	
	public static void main(String args[]) {
		CountConsonantsAndVowels obj = new CountConsonantsAndVowels();
		int[] result = obj.Count("");
		System.out.println(result[0]+ " Vowels "+result[1]+" Consonants");
		
		System.out.println(Integer.parseInt("-76549"));
	}
}
