package otherImpls;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

import otherInterfaces.Question;
import otherInterfaces.Quiz;

public class QuizImpl implements Quiz {

	@Override
	public int getQuizID(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getQuizName(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setQuestion(Question question) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeQuestion(int number) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isCorrect(int answer, int question) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void recordScore(int correct) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isHighScore(int score) {
		// TODO Auto-generated method stub
		return false;
	}

}
