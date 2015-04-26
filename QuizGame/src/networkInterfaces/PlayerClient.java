package networkInterfaces;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import networkImpls.*;
import networkInterfaces.*;
import otherImpls.*;
import otherInterfaces.*;

public interface PlayerClient extends Remote {

	/**
	 * Add a new Player to the server
	 * @param iD of the player
	 * @param name of the player
	 */
	Player newPlayer(int iD, String name) throws RemoteException;
	
	/**
	 * Log in an existing player
	 * @param iD of the player
	 * @param name of the player
	 */
	Player login(int iD, String name) throws RemoteException;
	
	
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
