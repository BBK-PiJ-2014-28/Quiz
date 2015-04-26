package networkImpls;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import otherInterfaces.Player;
import otherInterfaces.Quiz;
import networkInterfaces.PlayerClient;
import networkInterfaces.QuizGameService;
import networkInterfaces.SetupClient;

public class QuizGameMasterServer extends UnicastRemoteObject implements PlayerClient, QuizGameService,
		SetupClient {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1471392118156443119L;

	protected QuizGameMasterServer() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void newQuiz() throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void endQuiz(int ID) throws RemoteException {
		// TODO Auto-generated method stub

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
