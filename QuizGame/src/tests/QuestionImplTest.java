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

import otherImpls.*;

public class QuestionImplTest {
	
	public QuestionImpl testQuestion;
	private String posedQuestion;
	private String answer1, answer2, answer3, answer4;
	private int correctAnswer;
	private int questionNumber;

	@Before
	public void setUp() throws Exception {
		testQuestion = new QuestionImpl("What... is your name?");
	}

	@After
	public void tearDown() throws Exception {
		testQuestion = null;
	}

	@Test
	public void testGetQuestion() {
		assertEquals("What... is your name?", testQuestion.getQuestion());		
	}
	
	@Test
	public void testSetRiddle() {
		QuestionImpl secondTest = new QuestionImpl();
		secondTest.setRiddle("What... is your quest?");
		assertEquals("What... is your quest?", secondTest.getQuestion());
	}
	
	@Test
	public void testGetNumber(){
		testQuestion.setNumber(1);
		assertEquals(1, testQuestion.getNumber());
	}
	
	@Test
	public void testSetAnswer() {
		testQuestion.setAnswer(1, "Arthur, King of the Britons");
		testQuestion.setAnswer(4, "My name is Sir Lancelot of Camelot.");
		testQuestion.setAnswer(2, "Blue");
		testQuestion.setAnswer(3, "Camelot. It's a silly place.");
		assertEquals("Camelot. It's a silly place.", testQuestion.getAnswer(3));
		assertEquals("My name is Sir Lancelot of Camelot.", testQuestion.getAnswer(4));
	}
	
	@Test
	public void testSetCorrect(){
		testQuestion.setAnswer(1, "Arthur, King of the Britons");
		testQuestion.setAnswer(4, "My name is Sir Lancelot of Camelot.");
		testQuestion.setAnswer(2, "Blue");
		testQuestion.setAnswer(3, "Camelot. It's a silly place.");
		testQuestion.setCorrect(4);
		assertEquals("My name is Sir Lancelot of Camelot.", testQuestion.getCorrect());
	}

}
