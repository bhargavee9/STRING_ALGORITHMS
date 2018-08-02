package Test;
import com.bhargavee.stringalgos.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class CheckIfAnagramTest {

	CheckIfAnagram obj = new CheckIfAnagram();
	@Test
	void test() {
		assertTrue(obj.isAnagramusingsort("mary", "army"));
		assertTrue(obj.isAnagramusingsort("Boat", "btoA"));
		assertTrue(obj.isAnagramusingsort("Boat?", "btoA"));
		assertTrue(obj.isAnagramusingsort("Bo   at", "btoA"));
		assertTrue(obj.isAnagramusingsort("Boat,,...", "btoA"));
		assertTrue(obj.isAnagramusingsort("Boat!", "btoA"));
		assertTrue(obj.isAnagramusingsort("Boat12", "2btoA1"));
		assertFalse(obj.isAnagramusingsort("Boat123", "btoA121"));
		assertFalse(obj.isAnagramusingsort("Boatfa", "boat"));
		assertFalse(obj.isAnagramusingsort("", "boat"));
		assertTrue(obj.isAnagramusingsort("", ""));
		assertFalse(obj.isAnagramusingsort("Boat", ""));
		assertFalse(obj.isAnagramusingsort(null, null));
	}

}
