/*How to Print duplicate characters from String?
 
  Write a program to print duplicate characters from a given String,
  for example if String is "Java" then program should print "a".
  Bonus points if your program is robust and handle different kinds
  of input e.g. String without duplicate, null or empty String etc. */



package com.bhargavee.stringalgos;

public class DuplicateCharactersfromString {
	
	
	int[] allcharacters = new int[128];
	
	 public String findDuplicateCharactersfromString(String input) {
		fillzeros();
		char[] inputarray = input.toCharArray();
		for(int i=0;i<input.length();i++) {
			allcharacters[(int)inputarray[i]] += 1;
			
		}
		StringBuffer result = new StringBuffer("");
		for(int i=0;i<128;i++) {
			if(allcharacters[i]>1) {
				result = result.append((char)i);
			}
		}
		
		 return result.toString();
		 
		
	}
	 
	 public void fillzeros() {
		 for(int i=0;i<127;i++) {
			 allcharacters[i] =0;
		 }
	 }
	
	public static void main(String args[]) {
		DuplicateCharactersfromString obj = new DuplicateCharactersfromString();
		System.out.println(obj.findDuplicateCharactersfromString("java"));
	}

	 
}
