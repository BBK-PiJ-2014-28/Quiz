package otherInterfaces;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

import java.util.List;

public interface Player {
	
	/**
	 * Get Name of Player, given a player ID
	 * @param player ID
	 * @return the name of the player
	 */
	String getPlayerName();
	
	/**
	 * Get iD of player, given their name
	 * @param player name
	 * @return the iD of the player
	 */
	int getPlayerID();
	
	/**
	 * Get the current player score
	 * Will be necessary to set new high scores
	 * @return the score of the player
	 */
	int getCurrentScore();
	
	/**
	 * Get score of player on quiz - two variants, with name, with iD
	 * @param the ID of the quiz
	 * @param the name of the player OR the ID of the player
	 * @return the score of the player
	 */
	//Not sure this should be in this class - maybe in Quiz class
	int getPlayerScore(int quizID, String playerName);
	
	int getPlayerScore(int quizID, int playerID);
	
	/**
	 * {Additional Content:
	 * Get all the scores of the player on all quizzes
	 * @param the ID of the player OR the name of the player
	 * @return a list of their scores}
	 */
	List<?> getAllScores(int playerID);
	
	List<?> getAllScores(String playerName);
	
	/**
	 * {Additional Content:
	 * Displays if high scorer on quiz
	 * @param player name OR player ID
	 * @param ID of quiz
	 * @return Yes/No if player is high scorer}
	 */
	boolean isPlayerWinner(String playerName);
	
	boolean isPlayerWinner(int playerID);
	
	/**
	 * {Additional Content:
	 * Displays if player high scorer on ANY quiz
	 * @param player name OR player ID
	 * @return yes/no if player is a high scorer}
	 */
	boolean doesPlayerWinAtLife(String playerName);
	
	boolean doesPlayerWinAtLife(int playerID);

	//TODO consider new class QuizMaster give Player a password to start creating quizzes
}
