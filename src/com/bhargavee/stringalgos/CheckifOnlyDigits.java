/*** Check if String contains only DIGITS
 ******UPDATE REGULAR EXPRESSION CHEAT SHEET
 * ALSO UPDATE with Pattern.compile
 * 
 */

package com.bhargavee.stringalgos;

public class CheckifOnlyDigits {

	//We can also use Pattern.compile
	public boolean isOnlyDigits(String input) {
		
		if(input==null) return false;
		if(input.matches("[0-9]+"))
			return true;
		else
			return false;
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckifOnlyDigits obj = new CheckifOnlyDigits();
		System.out.println(obj.isOnlyDigits("1934b"));
		

	}

}
