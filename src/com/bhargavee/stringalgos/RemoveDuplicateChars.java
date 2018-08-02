/*REMOVE DUPLICATE CHARACTERS FROM A STRING 
 * 
 * 
 * EXAMPLE BANANAS = BANS
 * */

package com.bhargavee.stringalgos;
import java.util.*;

public class RemoveDuplicateChars {

	public String removeDuplicates(String input) {
		
		Map<Character,Integer> charmap = new HashMap<>();
		StringBuffer sb = new StringBuffer("");
		for(int i=0;i<input.length();i++) {
			if(!charmap.containsKey(input.charAt(i))) {
				sb.append(input.charAt(i));
				charmap.put(input.charAt(i),0 );
			}
			
		}
		
		return sb.toString();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveDuplicateChars obj = new RemoveDuplicateChars();
		System.out.println(obj.removeDuplicates("bananas"));
	}

}
