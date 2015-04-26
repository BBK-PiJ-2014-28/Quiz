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

public class PlayerClientImpl implements PlayerClient {
	
	List<QuizImpl> quizList = new ArrayList<QuizImpl>();
	List<Player> playerList = new ArrayList<Player>();
	int IDcount = playerList.size();
	Player currentUser = null;
	PlayerClientImpl quizPlayerClient;
	

	public static void main(String[] args) {
		PlayerClientLauncher launcher = new PlayerClientLauncher();
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
			
			quizPlayerClient = new SetupClientImpl();
			
			quizPlayerClient.run();
			
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
		System.out.println("Hello, welcome to the Quiz Gaming section!");
		System.out.println("What can we do for you?");
		System.out.println("Press 1 to log in, 2 to create a User,"
				+ " 3 to play a quiz, or 4 to show your scores.");
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
			Player loggedUser = quizPlayerClient.login(ID, playerName);
			this.currentUser = loggedUser;
			//Not sure if this will work, but will try it - recursively call, to get menu again!
			quizPlayerClient.run();
		} else if (option == 2) {
			System.out.println("Please enter your desired name:");
			Scanner name = new Scanner(System.in);
			String playerName = name.nextLine();
			int iD = IDcount + 1;
			System.out.println("Your unique ID is: " + iD + ", please remember it!");
			Player madeUser = quizPlayerClient.newPlayer(iD, playerName);
			this.currentUser = madeUser;
			quizPlayerClient.run();
		} else if (option == 3) {
			System.out.println("Thanks! Entering Play-a-quiz.");
			quizPlayerClient.getQuizList();
			System.out.println("Please pick your quiz.");
			quizPlayerClient.run();
		} else if (option == 4) {
			
			quizPlayerClient.run();
		} else if (option == 5) {
			System.out.println("Thanks for playing!");
			System.exit(0);
		}
	}

	@Override
	public Player newPlayer(int iD, String name) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player login(int iD, String name) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> getQuizList() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> getPlayerScores() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int playQuiz() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

}
