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
