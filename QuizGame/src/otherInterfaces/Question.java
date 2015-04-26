package otherInterfaces;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

public interface Question {

	/**
	 * Set the actual question
	 * @param the string that is the question
	 */
	void setRiddle(String question);
	
	/**
	 * Now adding a method to display the (text) question
	 * @return the question as a string
	 */
	String getQuestion();
	
	/**
	 * Set the question number
	 * @param the number of the question
	 */
	void setNumber(int number);
	
	/**
	 * Get the question number
	 * @return the number of the question
	 */
	int getNumber();
	
	/**
	 * Set an answer to the question
	 * Multiple choice, so can have up to 4 answers
	 * @param the answer number
	 * @param the answer wanted to input
	 */
	void setAnswer(int question, String answer) throws IllegalArgumentException;
	
	/**
	 * Get a specific answer
	 * @param the answer number
	 * @return the answer as a string
	 */
	String getAnswer(int answerNumber);
	
	/**
	 * Set which answer is the correct one
	 * @param the answer number that is correct
	 */
	void setCorrect(int answer);
	
	/**
	 * Gets the correct answer to the question, displays it as String
	 * @return the correct answer
	 */
	String getCorrect();
}
