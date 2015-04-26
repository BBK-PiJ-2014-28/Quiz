package networkImpls;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import otherInterfaces.Player;
import otherInterfaces.Quiz;
import networkInterfaces.QuizGameService;

public class QuizGameServer extends UnicastRemoteObject implements QuizGameService {

	private static final long serialVersionUID = 8983672091475806271L;

	protected QuizGameServer() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Quiz playQuiz(int iD) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createQuiz(Quiz newQuiz) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Player destroyQuiz(int iD) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void newPlayer(String newbieName) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public Player login(int iD, String name) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
