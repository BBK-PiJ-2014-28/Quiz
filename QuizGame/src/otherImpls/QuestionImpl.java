package otherImpls;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

import java.io.Serializable;

import otherInterfaces.Question;

public class QuestionImpl implements Question, Serializable {

	private static final long serialVersionUID = 2224420600163611753L;
	
	private String posedQuestion;
	private String answer1, answer2, answer3, answer4;
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

	//Not currently working - needs fix
	@Override
	public void setAnswer(int question, String answer) throws IllegalArgumentException {
		if (question == 1){
			this.answer1 = answer;
		} else if (question == 2) {
			this.answer2 = answer;
		} else if (question == 3) {
			this.answer3 = answer;
		} else if (question == 4) {
			this.answer4 = answer;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	//Not currently working - needs fix
	@Override
	public String getAnswer(int answerNumber) throws IllegalArgumentException {
		String answer = null;
		if (answerNumber == 1){
			this.answer1 = answer;
		} else if (answerNumber == 2) {
			this.answer2 = answer;
		} else if (answerNumber == 3) {
			this.answer3 = answer;
		} else if (answerNumber == 4) {
			this.answer4 = answer;
		} else {
			throw new IllegalArgumentException();
		}
		return answer;
	}

	@Override
	public void setCorrect(int answer) {
		this.correctAnswer = answer;
	}
	
	@Override
	public String getCorrect() {
		int correct = this.correctAnswer;
		String answer = null;
		if (correct == 1){
			this.answer1 = answer;
		} else if (correct == 2) {
			this.answer2 = answer;
		} else if (correct == 3) {
			this.answer3 = answer;
		} else if (correct == 4) {
			this.answer4 = answer;
		}
		return answer;
	}

}
