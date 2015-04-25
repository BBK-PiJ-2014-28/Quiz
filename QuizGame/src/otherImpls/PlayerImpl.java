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

	private static final long serialVersionUID = 5799469790743674521L;

	private int iD;
    private String name;
    private int score;

    //Constructors

    public PlayerImpl(String thisName){
        this.setName(thisName);
    }

	public PlayerImpl(int ID){
        this.setID(ID);
    }

	public PlayerImpl(int number, String playerName){
        this.setID(number);
        this.setName(playerName);
    }

    public PlayerImpl(String aName, int iDent, int myScore){
        this.setID(iDent);
        this.setName(aName);
        this.setScore(myScore);
    }

	//Getters and Setters
    
    private void setName(String thisName) {
		this.name = thisName;		
	}
    
    private void setID(int iD2) {
		this.iD = iD2;
	}
    
    public void setScore(int myScore) {
		this.score = myScore;
		
	}
	
	@Override
	public String getPlayerName() {
		String playerName = this.name;
		return playerName;
	}

	@Override
	public int getPlayerID() {
		int playerId = this.iD;
		return playerId;
	}

	@Override
	public int getCurrentScore() {
		int currentScore = this.score;
		return currentScore;
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
