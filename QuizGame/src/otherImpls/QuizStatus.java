package otherImpls;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 * 
 * This Enum is to indicate if a quiz is able to be played, being played,
 * or has been closed.
 * OPEN should be set when a quiz is created.
 * ACTIVE should be set when a player is playing the quiz, and should
 * revert to OPEN when they are done.
 * CLOSED is set when the quiz is closed. Players will not be able to play the quiz,
 * and the quiz will not be able to be modified.
 */

public enum QuizStatus {
	
	OPEN,
	ACTIVE,
	CLOSED
}
