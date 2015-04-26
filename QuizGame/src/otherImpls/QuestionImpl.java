package otherImpls;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

import otherInterfaces.Question;

public class QuestionImpl implements Question, Serializable {

	private static final long serialVersionUID = 2224420600163611753L;
	
	private String posedQuestion;
	private ArrayList<String> answers = new ArrayList<String>();
	private int correctAnswer;
	private int questionNumber;
	
	//Constructors
	
	public QuestionImpl() {
		
	}
	
	public QuestionImpl(String myQuestion){
        this.setRiddle(myQuestion);
    }

	public QuestionImpl(int number){
        this.setNumber(number);
    }

	public QuestionImpl(int number, String myQuestion){
        this.setNumber(number);
        this.setRiddle(myQuestion);
    }
	
	//Getters and Setters
	
	@Override
	public void setRiddle(String question) {
		this.posedQuestion = question;
	}
	
	@Override
	public String getQuestion() {
		return this.posedQuestion;
	}

	@Override
	public void setNumber(int number) {
		this.questionNumber = number;
	}
	
	@Override
	public int getNumber() {
		return this.questionNumber;
	}

	@Override
	public void setAnswer(int question, String answer) throws IllegalArgumentException {
		while(answers.size() < 4) { 
			answers.add("Ni!");
		}
		int answerNumber = question - 1;
		answers.set(answerNumber, answer);
	}
	
	@Override
	public String getAnswer(int answerNumber) throws IllegalArgumentException {
		String answer = answers.get(answerNumber - 1);
		return answer;
	}

	@Override
	public void setCorrect(int answer) {
		this.correctAnswer = answer;
	}
	
	@Override
	public String getCorrect() {
		int correct = this.correctAnswer - 1;
		String answer = answers.get(correct);
		return answer;
	}

}
