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
	 * @param the question
	 */
	void setQuestion(Question question);
	
	/**
	 * {Additional Content:
	 * Change a question in the quiz
	 * @param the question number that is to be changed}
	 */
	void changeQuestion(int number);

	/**
	 * Checks if given answer is correct
	 * @param answer given by player
	 * @param question number
	 */
	boolean isCorrect(int answer, int question);
	
	/**
	 * Records player score
	 * @param number of correct answers
	 */
	void recordScore(int correct);
	
	/**
	 * Checks if the score is the high score
	 * @param player score
	 */
	boolean isHighScore(int score);

	/**
	 * Sets the player with the high score as the winner
	 */
	
	//TODO think about how to achieve this

}
