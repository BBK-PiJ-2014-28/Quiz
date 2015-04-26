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

public interface SetupClient extends Remote {

	/**
	 * Player to log in to Setup Client
	 * @param player name
	 * @param player iD
	 */
	Player login(int iD, String name) throws RemoteException;
	
	/**
	 * Create new player
	 * @param player name
	 * @param player iD
	 */
	Player newPlayer(int iD, String name) throws RemoteException;
	
	/**
	 * Enables a new quiz to be made
	 */
	void newQuiz() throws RemoteException;
	
	/**
	 * Allows quizMaster who set up quiz to end the quiz
	 * Should return highest scoring player, and score
	 * {Additional: should check creator is closing}
	 * @return High Scorer
	 * @return High Score
	 */
	void endQuiz(int ID) throws RemoteException;
}
