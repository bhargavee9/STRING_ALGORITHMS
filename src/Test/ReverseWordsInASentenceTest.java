package Test;
import com.bhargavee.stringalgos.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bhargavee.stringalgos.ReverseWordsInASentence;

class ReverseWordsInASentenceTest {

	ReverseWordsInASentence obj = new ReverseWordsInASentence();
	@Test
	void testNull() {
       assertEquals(null,obj.reverseWordsInASentence(null));
	}

	@Test
	void testEmpty() {
	       assertEquals("",obj.reverseWordsInASentence(""));
		}
	
	@Test
	void testOneWord() {
	       assertEquals("Hello",obj.reverseWordsInASentence("Hello"));
		}
	
	@Test
	void test() {
	       assertEquals("This is Java programming",obj.reverseWordsInASentence("programming Java is This"));
		}
	
	@Test
	void testspaces() {
	       assertEquals(" ",obj.reverseWordsInASentence(" "));
		}
}
