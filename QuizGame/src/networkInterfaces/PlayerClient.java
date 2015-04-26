package networkInterfaces;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.List;

import networkImpls.QuizGameServer;
import networkImpls.QuizGameServerLauncher;

public interface PlayerClient {

	public static void main(String args[]){
		PlayerClient launcher = new PlayerClient();
		launcher.launch();
	}
	
	private void launch(){
		if (System.getSecurityManager() == null){
			System.setSecurityManager(new SecurityManager());
		}
		try {
			Remote service = Naming.lookup("//127.0.0.1:1099/quiz");
			

		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex){
			ex.printStackTrace();
		}
	}
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
