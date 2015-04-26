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
import java.util.ArrayList;
import java.util.List;

import otherInterfaces.*;
import otherImpls.*;
import networkInterfaces.*;
import networkImpls.*;

public class SetupClientImplTest {
	
	List<Quiz> quizList = new ArrayList<Quiz>();
	List<Player> playerList = new ArrayList<Player>();
	SetupClient testClient;

	@Before
	public void setUp() throws Exception {
		testClient = new SetupClientImpl();
	}

	@After
	public void tearDown() throws Exception {
		testClient = null;
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
