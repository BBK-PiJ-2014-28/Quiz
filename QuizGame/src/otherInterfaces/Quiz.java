package otherInterfaces;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

public interface Quiz {
	
	/**
	 * Get ID of quiz
	 * @param name of quiz
	 * @return the ID of the quiz
	 */
	int getQuizID(String name);
	
	/**
	 * Get Name of quiz
	 * @param ID of quiz
	 * @return the name of the quiz
	 */
	String getQuizName(int ID);
	
	/**
	 * Set a question in the quiz
	 * @param the question, as a string
	 */
	void setQuestion(String question);
	
	/**
	 * {Additional Content:
	 * Change a question in the quiz
	 * @param the question number that is to be changed
	 * @param the new question as a string}
	 */
	void changeQuestion(int number, String question);
	
	/**
	 * Set an answer to a question
	 * @param 
	 */

}
