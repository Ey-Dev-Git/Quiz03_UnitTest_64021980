package unit_test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class main_unit_test {

	QuizOneJunit obj;

	@Before
	public void setup() {
		obj = new QuizOneJunit();
	}

	// 1. Square Area
	@Test
	public void test01() {
		assertEquals(obj.square(5), 25);
	}

	@Test
	public void test02() {
		assertNotEquals(obj.square(5), 50);
	}

	// 2. Number of "a" and "A" letters
	@Test
	public void test03() {
		assertEquals(obj.countLetterA("University of phayao,Thailand"),4);
	}
	@Test
	public void test04() {
		assertNotEquals(obj.countLetterA("University of phayao,Thailand"),10);
	}
	
	//3. Two Letters are the same
	@Test
	public void test05() {
		assertTrue(obj.checkTwoLetter("AABCAA"));
	}
	
	@Test
	public void test06() {
		assertFalse(obj.checkTwoLetter("A"));
	}
	
	public void test07() {
		assertEquals(obj.checkTwoLetter("A"),false);
	}
	
}
