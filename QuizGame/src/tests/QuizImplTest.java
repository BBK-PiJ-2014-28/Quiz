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
	private int playerScore;
	private int highScore = 0;
	private ArrayList<Question> tomRiddles = new ArrayList<Question>();
	private int scores[];
	public QuizImpl testQuiz;

	@Before
	public void setUp() throws Exception {
		testQuiz = new QuizImpl(12, "The Holy Grail");
		testQuiz.setQuestion(3, "What... is your favourite colour?");
	}

	@After
	public void tearDown() throws Exception {
		testQuiz = null;
	}


	@Test
	public void testGetID() {
		assertEquals(12, testQuiz.getQuizID());
	}
	
	
	@Test
	public void testSetID(){
		QuizImpl secondQuiz = new QuizImpl();
		secondQuiz.setQuizID(134);
		assertEquals(134, secondQuiz.getQuizID());
	}
	
	@Test
	public void testGetName(){
		assertEquals("The Holy Grail", testQuiz.getQuizName());
	}
	
	@Test
	public void testSetName(){
		QuizImpl secondTest = new QuizImpl();
		secondTest.setQuizName("Questions Three");
		assertEquals("Questions Three", secondTest.getQuizName());
	}
	

	//ArrayList of questions!
	@Test
	public void testSetQuestion(){
		String riddleMeThis = testQuiz.getQuestion(3).getQuestion();
		assertEquals("What... is your favourite colour?", riddleMeThis);
	}
	
	@Test
	public void testIsCorrect(){
		testQuiz.getQuestion(3).setAnswer(1, "Blue. No! Yell...");
		testQuiz.getQuestion(3).setCorrect(1);
		assertTrue(testQuiz.isCorrect(1, 3));
	}
	
	@Test
	public void testSetScore(){
		playerScore = 20;
		testQuiz.recordScore(playerScore);
		assertEquals(20, testQuiz.getScore());
	}
	
	@Test
	public void testHighScore(){
		testQuiz.recordScore(20);
		testQuiz.recordScore(16);
		playerScore = 21;
		assertTrue(testQuiz.isHighScore(playerScore));
	}

}
