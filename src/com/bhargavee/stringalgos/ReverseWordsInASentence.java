/* REVERSE WORDS IN A SENTENCE*/

package com.bhargavee.stringalgos;

public class ReverseWordsInASentence {

	public String reverseWordsInASentence(String sentence) {
		if(sentence==null) return null;
		sentence.replace("\\s+"," ");
		if(sentence=="") return "";
		if(sentence==" ") return " ";
		String[] words = sentence.split(" ");
		StringBuffer result = new StringBuffer("");
		for(int i=words.length-1;i>0;i--) {
			result.append(words[i]);
			result.append(" ");
			
		}
		result.append(words[0]);
		return result.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWordsInASentence obj = new ReverseWordsInASentence();
		System.out.println(obj.reverseWordsInASentence("This is java programming"));
		

	}

}
