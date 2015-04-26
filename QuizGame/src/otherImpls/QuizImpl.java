package otherImpls;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

import java.util.*;

import otherInterfaces.*;

public class QuizImpl implements Quiz {

	private String quizName;
	private int quizID;
	private int playerScore;
	private ArrayList<Question> tomRiddles = new ArrayList<Question>();
	private int scores[];

	
	//Constructors
	
	public QuizImpl(String thisName){
        this.setQuizName(thisName);
    }

	public QuizImpl(int ID){
        this.setQuizID(ID);
    }

	public QuizImpl(int ID, String quizName){
        this.setQuizID(ID);
        this.setQuizName(quizName);
    }

    public QuizImpl(String quizName, int ID, int myScore){
        this.setQuizID(ID);
        this.setQuizName(quizName);
        this.recordScore(myScore);
    }
    
    //Getters and Setters
    
	@Override
	public void setQuizID(int number) {
		this.quizID = number;
	}
	
	@Override
	public int getQuizID() {
		return this.quizID;
	}	

	@Override
	public void setQuizName(String name) {
		this.quizName = name;
	}

	@Override
	public String getQuizName() {
		return this.quizName;
	}

	public ArrayList<Question> getTomRiddes() {
		return tomRiddles;
	}

	public void setTomRiddes(ArrayList<Question> tomRiddes) {
		this.tomRiddles = tomRiddes;
	}

	@Override
	public void setQuestion() {
		Question newQuestion = new QuestionImpl();
		tomRiddles.add(newQuestion);
	}
	
	@Override
	public void setQuestion(String shrubbery) {
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
	public int getMyScore() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isHighScore(int score) {
		// TODO Auto-generated method stub
		return false;
	}


}
