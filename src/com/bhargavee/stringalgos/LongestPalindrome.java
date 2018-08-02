/* FIND THE LONGEST EXISTENT PALINDROME IN A STRING*/

package com.bhargavee.stringalgos;

public class LongestPalindrome {

	public String findLongestPalindrome(String input) {
		int maxlen=0;
	    String palindrome="";
		for(int i=0;i<input.length();i++) {
			 int oddlen = expandAround(input,i,i)-1;;
			 int evenlen = expandAround(input,i,i+1);
		     int start=0,end =0;
		     int tempmaxlen = Math.max(oddlen, evenlen);
		     if(maxlen<tempmaxlen)
		     {
		    	 maxlen = tempmaxlen;
		    	 start = i-(maxlen)/2;
		    	 end = i+(maxlen)/2;
			     palindrome = input.substring(start, end+1);
		     }
		     
		}
		
		return palindrome;
	}
	
	public int expandAround(String input,int left,int right) {
		int end = input.length();
		int start = 0;
		int count=0;
		while(left>=start && right<end) {
			if(input.charAt(left)!=input.charAt(right)) {
				break;
			}
			count = count+2;
			left--;
			right++;
			
		}
		
		return count;
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindrome obj = new LongestPalindrome();
        System.out.println(obj.findLongestPalindrome("madam"));
	}

}
