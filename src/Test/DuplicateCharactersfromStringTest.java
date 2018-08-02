package Test;

import static org.junit.jupiter.api.Assertions.*;

import com.bhargavee.stringalgos.*;
import org.junit.jupiter.api.Test;

import com.bhargavee.stringalgos.DuplicateCharactersfromString;

class DuplicateCharactersfromStringTest {

	DuplicateCharactersfromString dcfs = new DuplicateCharactersfromString();
	@Test
	void DuplicateCharactersFromString1() {
	 String actual = dcfs.findDuplicateCharactersfromString("java");
	 assertEquals("a",actual);
		
	}
	
	@Test
	void DuplicateCharactersFromString2() {
	 String actual = dcfs.findDuplicateCharactersfromString("abbbbbababacde");
	 assertEquals("ab",actual);
		
	}
	
	@Test
	void DuplicateCharactersFromString3() {
	 String actual = dcfs.findDuplicateCharactersfromString("abcde");
	 assertTrue(actual.equals(""));
		
	}
	
	@Test
	void DuplicateCharactersFromStringnull() {		 
		 Throwable exception = assertThrows(NullPointerException.class,
		            ()->{dcfs.findDuplicateCharactersfromString(null);} );
			
		}
	
	@Test
	void DuplicateCharactersFromStringempty() {		 
		 String actual = dcfs.findDuplicateCharactersfromString("");
		 assertTrue(actual.equals(""));
			
		}

}
