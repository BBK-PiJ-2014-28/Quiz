package networkInterfaces;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

import java.util.List;

public interface PlayerClient {

	/**
	 * Gets a list of the available Quizzes for the player
	 * @return List of quizzes
	 */
	List<?> getQuizList();
	
	/**
	 * Shows the player a list of their scores
	 * @return List of player's scores
	 */
	List<?> getPlayerScores();
	
	/**
	 * Gets the Player's requested Quiz
	 * Player can play quiz
	 * Returns their score on the quiz
	 * @return Player's score on chosen quiz
	 */
	int playQuiz();
}
