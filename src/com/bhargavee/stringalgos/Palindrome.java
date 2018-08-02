/*CHECK IF STRING IS A PALINDROME*/

package com.bhargavee.stringalgos;

public class Palindrome {
	
	public boolean palindrome(String str) {
		String another;
		int i,j;
		j=str.length()/2;

		 if(str.length()%2 != 0)
		   i=str.length()/2;
		 else 
			 i= (str.length()/2)-1;

		 for(;i>=0 && j<str.length();i--,j++) {
			 if(str.charAt(i)!=str.charAt(j))
				 return false;
			 
		 }
			 
		 return true;
		 
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Palindrome p = new Palindrome();
       System.out.println(p.palindrome("abc"));
		
	}

}
