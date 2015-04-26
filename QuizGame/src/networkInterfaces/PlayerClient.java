package networkInterfaces;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import networkImpls.QuizGameServer;
import networkImpls.QuizGameServerLauncher;

public interface PlayerClient extends Remote {

	/**
	 * Gets a list of the available Quizzes for the player
	 * @return List of quizzes
	 */
	List<?> getQuizList() throws RemoteException;
	
	/**
	 * Shows the player a list of their scores
	 * @return List of player's scores
	 */
	List<?> getPlayerScores() throws RemoteException;
	
	/**
	 * Gets the Player's requested Quiz
	 * Player can play quiz
	 * Returns their score on the quiz
	 * @return Player's score on chosen quiz
	 */
	int playQuiz() throws RemoteException;
}
