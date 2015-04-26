package networkImpls;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

import java.rmi.RemoteException;
import java.rmi.Remote;
import java.util.List;
import java.util.Scanner;

import otherInterfaces.*;
import networkInterfaces.SetupClient;



public class SetupClientImpl implements SetupClient {

	@Override
	public Player login(int iD, String name) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
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
