package otherImpls;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

import java.io.Serializable;
import java.util.*;

import otherInterfaces.*;

public class QuizImpl implements Quiz, Serializable {

	private String quizName;
	private int quizID;
	private int playerScore;
	private int highScore = 0;
	private ArrayList<Question> tomRiddles = new ArrayList<Question>();
	private int scores[] = new int[] {};

	
	//Constructors
	
	public QuizImpl(){
		this.setQuizName("Ni!");
		while(tomRiddles.size() < 20) { 
			tomRiddles.add(new QuestionImpl());
		}
	}
	
	public QuizImpl(String thisName){
        this.setQuizName(thisName);
        while(tomRiddles.size() < 20) { 
			tomRiddles.add(new QuestionImpl());
		}
    }

	public QuizImpl(int ID){
        this.setQuizID(ID);
        while(tomRiddles.size() < 20) { 
			tomRiddles.add(new QuestionImpl());
		}
    }

	public QuizImpl(int ID, String quizName){
        this.setQuizID(ID);
        this.setQuizName(quizName);
        while(tomRiddles.size() < 20) { 
			tomRiddles.add(new QuestionImpl());
		}
    }

    public QuizImpl(String quizName, int ID, int myScore){
        this.setQuizID(ID);
        this.setQuizName(quizName);
        this.recordScore(myScore);
        while(tomRiddles.size() < 20) { 
			tomRiddles.add(new QuestionImpl());
		}
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
		Question newQuestion = new QuestionImpl(shrubbery);
		tomRiddles.add(newQuestion);
	}
	
	//Method to add at any question number that user wants
	public void setQuestion(int number, String shrubbery) {
		Question newQuestion = new QuestionImpl(shrubbery);
		tomRiddles.add(number-1, newQuestion);
	}
	
	@Override
	public Question getQuestion(int number){
		Question requested = new QuestionImpl();
		requested = tomRiddles.get(number - 1);
		return requested;
	}

	@Override
	public void changeQuestion(int number) {
		// TODO Auto-generated method stub
		//Additional content will be added (if time) once base program is complete
	}

	@Override
	public boolean isCorrect(int answer, int question) {
		if (tomRiddles.get(question - 1).getCorrect() 
				== tomRiddles.get(question - 1).getAnswer(answer)) {
			return true;
		} else 
			return false;
	}

	@Override
	public void recordScore(int correct) {
		this.playerScore = correct;
		//Inserted into method to keep running highscore for simplicity of code
		if (correct > highScore) {
			highScore = correct;
		}
		//Not sure array of scores is necessary (might also, if it is, be better to use arraylist)
	}
	
	@Override
	public int getMyScore() {
		return this.playerScore;
	}

	@Override
	public boolean isHighScore(int score) {
		if (score > highScore){
			return true;
		}
		return false;
	}


}
