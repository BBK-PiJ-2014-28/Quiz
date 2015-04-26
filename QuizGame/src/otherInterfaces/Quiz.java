package otherInterfaces;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

public interface Quiz {
	
	/**
	 * Set the ID of the quiz
	 * @param the ID number for the quiz
	 */
	void setQuizID(int number);
	
	/**
	 * Get ID of quiz
	 * @return the ID of the quiz
	 */
	int getQuizID();
	
	/**
	 * Set the name of the quiz
	 * @param the name of the quiz
	 */
	void setQuizName(String name);
	
	/**
	 * Get Name of quiz
	 * @return the name of the quiz
	 */
	String getQuizName();
	
	/**
	 * Initialise a question in the quiz
	 */
	void setQuestion();
	
	/**
	 * Setting a question with the actual question
	 * @param string of the question to be asked
	 */
	void setQuestion(String shrubbery);
	
	/**
	 * Set question at a certain number
	 * @param number desired
	 * @param question
	 */
	void setQuestion(int n, String shrubbery);
	
	/**
	 * Get Question - return the question with the given number
	 * @return question with number
	 */
	Question getQuestion(int number);
	
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
	 * Get the current player's score
	 * @return the score
	 */
	int getMyScore();
	
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
