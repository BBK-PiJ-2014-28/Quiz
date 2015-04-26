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
	
	

	public static void main(String[] args) {
		SetupClientLauncher launcher = new SetupClientLauncher();
		launcher.launch();
	}
	
	public void launch(){
		if (System.getSecurityManager() == null){
			System.setSecurityManager(new SecurityManager());
		}
		try {
			Remote service = Naming.lookup("//127.0.0.1:1099/quiz");
			QuizGameService setupClient = (QuizGameService) service;
			
			

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
		Player result = null;
		if ((id >= 0 && id < playerList.size()) 	&&
			playerList.get(id).getName().equals(name)){
			result = playerList.get(id);
			System.out.println(result.display()+" logged in");
		}else{
			System.out.println("Login failed with "+id+" and "+name);
		}
		
		return result;
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
