package networkImpls;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

import java.util.List;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.Naming;
import java.rmi.registry.*;

import networkInterfaces.*;
import networkImpls.*;
import otherInterfaces.*;
import otherImpls.*;

public class PlayerClientLauncher implements PlayerClient {
	
	public static void main(String args[]){
		PlayerClientLauncher launcher = new PlayerClientLauncher();
		launcher.launch();
	}
	
	private void launch(){
		if (System.getSecurityManager() == null){
			System.setSecurityManager(new SecurityManager());
		}
		try {
			Remote service = Naming.lookup("//127.0.0.1:1099/quiz");
			QuizGameService playerClient = (QuizGameService) service;

		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex){
			ex.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		}

	@Override
	public List<?> getQuizList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> getPlayerScores() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int playQuiz() {
		// TODO Auto-generated method stub
		return 0;
	}

}
