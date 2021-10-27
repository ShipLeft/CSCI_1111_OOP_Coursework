import static org.junit.Assert.*;

import org.junit.Test;

/**
 * <h1>JUnit_test_for_project1111</h1>
 * 
 * <p>This class will test all returning value methods.</p>
 * 
 * <p>Created: 10/27/2021</p>
 * 
 * @author Rhett Boatright
 */
public class JUnit_test_for_project1111 {

	@Test
	public void test() {
		Coin coinTest = new Coin();
		boolean output = coinTest.getCoin();
		assertEquals(false, output);
		
		Games gamesTest = new Games();
		int gamesOutput = gamesTest.getPlayerOne();
		assertEquals(0, gamesOutput);
		
		int gamesOutput1 = gamesTest.getPlayerTwo();
		assertEquals(0, gamesOutput1);
		
		Hangman hangmanTest = new Hangman();
		
		boolean hangmanHead = hangmanTest.getHead();
		assertEquals(false, hangmanHead);
		
		boolean hangmanBody = hangmanTest.getBody();
		assertEquals(false, hangmanBody);
		
		boolean hangmanRightArm = hangmanTest.getRightArm();
		assertEquals(false, hangmanRightArm);
		
		boolean hangmanLeftArm = hangmanTest.getLeftArm();
		assertEquals(false, hangmanLeftArm);
		
		boolean hangmanRightLeg = hangmanTest.getRightLeg();
		assertEquals(false, hangmanRightLeg);
		
		boolean hangmanLeftLeg = hangmanTest.getLeftLeg();
		assertEquals(false, hangmanLeftLeg);
		
		String hangmanWords = hangmanTest.getWords();
		assertEquals("", hangmanWords);
		
		Tic_Tac_Toe t3Test = new Tic_Tac_Toe();
		
		String[][] t3ArrayOutcome = t3Test.getGameBoard();
		String[][] expectedOutcome = {{"","",""}, {"", "", ""}, {"", "",""}};
		assertArrayEquals(expectedOutcome, t3ArrayOutcome);
		
		Boolean t3X = t3Test.getX();
		assertEquals(true, t3X);
		
		Boolean t3O = t3Test.getO();
		assertEquals(false, t3O);
		
		String t3Winner = t3Test.getWinner();
		assertEquals("noOne", t3Winner);
		
		String t3CheckWinner = t3Test.checkWinner();
		assertEquals("noOne", t3CheckWinner);
		
		String t3ToString = t3Test.toString();
		assertEquals("noOne", t3ToString);
	}

}
