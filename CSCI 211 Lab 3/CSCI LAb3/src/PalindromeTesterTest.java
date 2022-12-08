import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTesterTest 
{

	@Test
	public void testPalindrome1() throws Exception
	{
		PalindromeTester test1 = new PalindromeTester(); 
		assertTrue(test1.isPalindrome("mom"));

	}
	@Test
	public void testPalindrome2() throws Exception
	{
		PalindromeTester test1 = new PalindromeTester(); 
		assertFalse(test1.isPalindrome("car"));

	}
	
	@Test
	public void testPalindrome3() throws Exception
	{
		PalindromeTester test1 = new PalindromeTester(); 
		assertTrue(test1.isPalindrome("racecar"));

	}
	//Add other test to check to see if they pass
	
}
