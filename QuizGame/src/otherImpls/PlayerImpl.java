package otherImpls;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

import java.util.List;
import java.io.Serializable;

import otherInterfaces.Player;

public class PlayerImpl implements Player, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5799469790743674521L;

	@Override
	public String getPlayerName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPlayerID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCurrentScore() {
		//TODO
		return 0;
	}
	
	//Not sure this should be in Player Class
	@Override
	public int getPlayerScore(int quizID, String playerName) {
		// TODO Auto-generated method stub
		return 0;
	}

	//Not sure this should be in Player Class
	@Override
	public int getPlayerScore(int quizID, int playerID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<?> getAllScores(int playerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> getAllScores(String playerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPlayerWinner(String playerName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPlayerWinner(int playerID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doesPlayerWinAtLife(String playerName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doesPlayerWinAtLife(int playerID) {
		// TODO Auto-generated method stub
		return false;
	}

}
