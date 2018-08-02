/*Reverse a String 
 * 
 *  ITERATIVE
 *  RECURSIVE
 * 
 */

package com.bhargavee.stringalgos;

public class ReverseString {

	public String reverseStringIterative(String original) {
		if(original == null) return null;
		if(original == "") return "";
		char[] originalarray = original.toCharArray();
		StringBuffer result = new StringBuffer("");
		int n = original.length();
		for(int i=n-1;i>=0;i--) {
			result.append(originalarray[i]);
		}
		return result.toString();
		
	}
	
	public String reverseStringRecursion(String original) {
		if(original=="") return "";
		else if(original==null) return null;
		
		if(original.length()==1) return original;
		String s = reverseStringRecursion(original.substring(1, original.length()));
		return s+original.charAt(0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rs = new ReverseString();
		System.out.println(rs.reverseStringRecursion("boat"));
		
	}

}
