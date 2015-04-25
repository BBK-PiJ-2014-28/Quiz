package tests;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import otherInterfaces.Player;
import otherImpls.PlayerImpl;

public class PlayerImplTest {
	
	private int iD;
	private String name;
	public int score;
	

	@Before
	public void setUp() throws Exception {
		testPlayer = new PlayerImpl("n00b", 1337);
		testPlayer.setCurrentScore(3);
	}

	@After
	public void tearDown() throws Exception {
		testPlayer = null;
	}

	@Test
    public void testGetID() {
        assertEquals(1337, testPlayer.getPlayerID());
    }

    //test getName method
    @Test
    public void testNameFetch() {
        assertEquals("n00b", testPlayer.getPlayerName());
    }
    
    @Test
    public void testScoreFetch(){
    	assertEquals(3, testPlayer.getCurrentScore());
    }

}
