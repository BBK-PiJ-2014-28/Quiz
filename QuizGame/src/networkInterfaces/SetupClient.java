package networkInterfaces;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

public interface SetupClient {

	/**
	 * Enables a new quiz to be made
	 */
	void newQuiz();
	
	/**
	 * Allows quizMaster who set up quiz to end the quiz
	 * {Additional: should check creator is closing}
	 */
	void endQuiz();
}
