package Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bhargavee.stringalgos.ReverseString;

class ReverseStringTest {

	ReverseString rs = new ReverseString();
	
	@Test
	void test() {
		
		assertEquals("",rs.reverseStringRecursion(""));
		assertEquals(null,rs.reverseStringRecursion(null));
		assertEquals("a",rs.reverseStringRecursion("a"));
		assertEquals("aaa",rs.reverseStringRecursion("aaa"));
		assertEquals("dabaredyh",rs.reverseStringRecursion("hyderabad"));
	}

}
