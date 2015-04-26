package networkInterfaces;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SetupClient extends Remote {

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
