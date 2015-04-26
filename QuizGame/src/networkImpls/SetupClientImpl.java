package networkImpls;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.Remote;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import otherInterfaces.*;
import networkInterfaces.*;
import otherImpls.*;
import networkImpls.*;


public class SetupClientImpl implements SetupClient {
	
	List<QuizImpl> quizList = new ArrayList<QuizImpl>();
	List<Player> playerList = new ArrayList<Player>();
	int IDcount = playerList.size();
	Player currentUser = null;
	SetupClientImpl quizMasterClient;
	

	public static void main(String[] args) {
		SetupClientLauncher launcher = new SetupClientLauncher();
		launcher.launch();
	}
	
	@SuppressWarnings("resource")
	public void launch(){
		if (System.getSecurityManager() == null){
			System.setSecurityManager(new SecurityManager());
		}
		try {
			Remote service = Naming.lookup("//127.0.0.1:1099/quiz");
			QuizGameService setupClient = (QuizGameService) service;
			
			quizMasterClient = new SetupClientImpl();
			
			quizMasterClient.run();
			
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex){
			ex.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("resource")
	public void run() throws RemoteException{
		System.out.println("Hello, welcome to the Quiz Master section!");
		System.out.println("What can we do for you?");
		System.out.println("Press 1 to log in, 2 to create a User,"
				+ " 3 to create a quiz, or 4 to close a quiz.");
		System.out.println("You may enter 5 to exit.");
		Scanner choice = new Scanner(System.in);
		int option = choice.nextInt();
		if (option == 1) {
			System.out.println("Please enter your name:");
			Scanner name = new Scanner(System.in);
			String playerName = name.nextLine();
			System.out.println("Please enter your unique ID (I hope you"
					+ " haven't forgotten it!");
			Scanner password = new Scanner(System.in);
			int ID = password.nextInt();
			Player loggedUser = quizMasterClient.login(ID, playerName);
			this.currentUser = loggedUser;
			//Not sure if this will work, but will try it - recursively call, to get menu again!
			quizMasterClient.run();
		} else if (option == 2) {
			System.out.println("Please enter your desired name:");
			Scanner name = new Scanner(System.in);
			String playerName = name.nextLine();
			int iD = IDcount + 1;
			System.out.println("Your unique ID is: " + iD + ", please remember it!");
			Player madeUser = quizMasterClient.newPlayer(iD, playerName);
			this.currentUser = madeUser;
			quizMasterClient.run();
		} else if (option == 3) {
			System.out.println("Thanks! Entering Create-a-quiz.");
			quizMasterClient.newQuiz();
			quizMasterClient.run();
		} else if (option == 4) {
			System.out.println("Are you sure? There is no going back.");
			System.out.println("Enter the Quiz ID, or 0 to exit back to the menu");
			Scanner answer = new Scanner(System.in);
			int i = answer.nextInt();
			if (i == 0) {
				quizMasterClient.run();
			} else {
				quizMasterClient.endQuiz(i);
			}
			quizMasterClient.run();
		} else if (option == 5) {
			System.out.println("Thanks for playing!");
			System.exit(0);
		}
	}
	@Override
	public Player login(int iD, String name) throws RemoteException {
		Player loginAttempt = playerList.get(iD - 1);
		if (loginAttempt.getPlayerName() == name) {
			System.out.println("Login Success!");
		} else {
			System.out.println("Incorrect Name or ID, please try again.");
			loginAttempt = null;
		}		
		return loginAttempt;
	}

	@Override
	public Player newPlayer(int iD, String name) throws RemoteException {
		Player newbie = new PlayerImpl(iD, name);
		playerList.add(newbie);
		System.out.println("Success! You have been added!");
		return newbie;
	}

	@Override
	public void newQuiz() throws RemoteException {
		Quiz myQuiz = new QuizImpl();
		int questionNumber = 1;
		do { 
			System.out.println("Please type your question:");
			Scanner q = new Scanner(System.in);
			String qu = q.nextLine();
			myQuiz.setQuestion(questionNumber, qu);
			questionNumber++;
			int answerNumber = 1;
			do {
				System.out.println("Please type an answer");
				Scanner a = new Scanner(System.in);
				String an = a.nextLine();
				myQuiz.getQuestion(questionNumber - 1).setAnswer(answerNumber, an);
				answerNumber++;
			} while (answerNumber < 4);
			System.out.println("Please press 1 to add another question, 0 to exit.");
			Scanner n = new Scanner(System.in);
			int s = n.nextInt();
		} while (s != 0);

	}

	@Override
	public void endQuiz(int ID) throws RemoteException {
		QuizImpl finished = quizList.get(ID - 1);
		int winningScore = finished.highScore;
		System.out.println("And the high score was: " + winningScore);
		Player finalist = finished.getWinner();
		System.out.println("Which was achieved by: " + finalist);
	}

}
