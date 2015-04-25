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
	 * Get the question number
	 * @return the number of the question
	 */
	int getNumber();
	
	/**
	 * Set an answer to the question
	 * Multiple choice, so can have up to 4 answers
	 * @param the question number
	 * @param the answer number
	 */
	void setAnswer(int question, int answer);
	
	/**
	 * Set which answer is the correct one
	 * @param the answer number that is correct
	 */
	void setCorrect(int answer);
	
	
}
