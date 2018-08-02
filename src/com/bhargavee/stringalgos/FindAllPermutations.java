/*
 * Find all permutations of a string
 * 
 *  RECURSIVE
 *  ITERATIVE
 *  RECURSIVE WHEN THERE IS AN ARRAY INSTEAD OF A STRING
 *  
 */

package com.bhargavee.stringalgos;
import java.util.*;

public class FindAllPermutations {

	//Recursive
	public void findPermutationsR(String prefix, String remaining) {
	
		if(remaining.length()==1) {
			System.out.println(prefix+remaining);
	        return;
		}
		for(int i=0;i<remaining.length();i++) {
			findPermutationsR(prefix+remaining.charAt(i),remaining.substring(0, i)+remaining.substring(i+1));
			
		}
		
	}
	
	//Array Recursive
	
	public void arrayPermutationsR(char[] input,int k) {
		
		for(int i=k;i<input.length;i++)
		{
			swap(input,i,k);
			arrayPermutationsR(input,k+1);
			swap(input,k,i);
			
		}
		
		if(k==input.length-1) {
			System.out.println(Arrays.toString(input));
		}
		
	}
	
	public void swap(char[] input, int k, int i) {
		char temp = input[k];
		input[k] = input[i];
		input[i] = temp;
		
		
	}
	//Iterative
	public void findPermuatationI(String input) {
	 
		int n = input.length();
		List<String> result = new ArrayList<String>();
		result.add(""+input.charAt(0));
		for(int i=1;i<n;i++) 
		{
		   char ch = input.charAt(i);
		   for(int j=result.size()-1;j>=0;j--) {
			    String temp = result.remove(j);
			    for(int k=0;k<=temp.length();k++)
			    {
			      String newtemp = temp.substring(0, k)+ch+temp.substring(k) ;
			      result.add(newtemp);
			      System.out.println("Partial result "+newtemp);
			    	
			    }
		   }
		}
		
		
	
		for(int i=0;i<result.size();i++)
		  System.out.println(result.get(i));
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		FindAllPermutations obj = new FindAllPermutations();
		/*obj.findPermuatationI("abc");*/
		
		obj.arrayPermutationsR(new char[]{'a','b','c'},0);
		
	}

}
