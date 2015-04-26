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
import java.util.*;

import otherImpls.*;
import otherInterfaces.*;

public class QuizImplTest {
	
	private int quizID;
	private ArrayList<Question> tomRiddes = new ArrayList<Question>();
	public QuizImpl testQuiz;

	@Before
	public void setUp() throws Exception {
		testQuiz = new QuizImpl(12, "The Holy Grail");
	}

	@After
	public void tearDown() throws Exception {
		testQuiz = null;
	}

	
	//Will require a setID method as well, just in case TODO
	@Test
	public void testGetID() {
		assertEquals(12, testQuiz.getQuizID());
	}
	
	//Realised getID shouldn't require string, that should be for Client/Server
	
	@Test
	public void testSetID(){
		QuizImpl secondQuiz = new QuizImpl();
		secondQuiz.setQuizID(134);
		assertEquals(134, secondQuiz.getQuizID());
	}
	
	//Same for these, shouldn't require ID
	@Test
	public void testGetName(){
		assertEquals("The Holy Grail", testQuiz.getQuizName());
	}
	
	//Setname method should be added TODO
	@Test
	public void testSetName(){
		QuizImpl secondTest = new QuizImpl();
		secondTest.setQuizName("Questions Three");
		assertEquals("Questions Three", secondTest.getQuizName());
	}
	
	//getQuestion should be added TODO
	//Should not require a Question already, should initialise empty Question
	//Or have String for posedQuestion
	//ArrayList of questions!
	@Test
	public void testSetQuestion(){
		testQuiz.setQuestion(3, "What... is your favourite colour?");
		String riddleMeThis = testQuiz.getQuizQuestion(3).getQuestion();
		assertEquals("What... is your favourite colour?", riddleMeThis);
	}

}
