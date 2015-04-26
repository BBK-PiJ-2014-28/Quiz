package networkInterfaces;
/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

import otherInterfaces.*;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface QuizGameService extends Remote {
	
	/**
	 * Starts the quiz with the requested ID
	 * @param the ID of the quiz
	 * @return the quiz
	 */
	Quiz playQuiz(int iD) throws RemoteException;
	
	/**
	 * Server will need method for adding quiz
	 * Should return the iD for the quiz
	 * @param the quiz to be made
	 * @return the iD of the quiz
	 */
	int createQuiz(Quiz newQuiz) throws RemoteException;
	
	/**
	 * Server will need method to end quiz
	 * Should return the highest scoring player
	 * {Potential Additional: Return list of top three?}
	 * {Potential Additional: check creator is closing}
	 * @param the iD of the quiz to be closed
	 * @return the highest scoring player
	 */
	Player destroyQuiz(int iD) throws RemoteException;
	
	/**
	 * Server will need method to add a new player
	 * {Additional: Player unique iD?}
	 * {Additional: Password?}
	 * @param the player name
	 */
	void newPlayer(String newbieName) throws RemoteException;
	
	/**
	 * Log in method for existing players
	 * @param player name
	 * @param player ID 
	 */
	Player login(int iD, String name) throws RemoteException;
	
	//TODO consider how to store all things in Server - Flush method?

}

