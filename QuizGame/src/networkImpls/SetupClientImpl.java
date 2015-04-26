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
	
	List<Quiz> quizList = new ArrayList<Quiz>();
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
			
			/**
			 * What follows is the interface to be displayed to the User
			 * It calls the launch method recursively to recall the menu.
			 * {Should put this in new method so as not to look up the client each time}
			 */
			
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
				quizMasterClient.launch();
			} else if (option == 2) {
				System.out.println("Please enter your desired name:");
				Scanner name = new Scanner(System.in);
				String playerName = name.nextLine();
				int iD = IDcount + 1;
				System.out.println("Your unique ID is: " + iD + ", please remember it!");
				quizMasterClient.newPlayer(iD, playerName);
				quizMasterClient.launch();
			} else if (option == 3) {
				System.out.println("Thanks! Entering Create-a-quiz.");
				quizMasterClient.newQuiz();
				quizMasterClient.launch();
			} else if (option == 4) {
				System.out.println("Are you sure? There is no going back.");
				System.out.println("Enter the Quiz ID, or 0 to exit back to the menu");
				Scanner answer = new Scanner(System.in);
				int i = answer.nextInt();
				if (i == 0) {
					quizMasterClient.launch();
				} else {
					quizMasterClient.endQuiz(i);
				}
				quizMasterClient.launch();
			} else if (option == 5) {
				System.out.println("Thanks for playing!");
				System.exit(0);
			}
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex){
			ex.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void newQuiz() throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void endQuiz(int ID) throws RemoteException {
		// TODO Auto-generated method stub

	}

}
