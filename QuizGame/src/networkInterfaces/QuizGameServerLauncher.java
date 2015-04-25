package networkInterfaces;

/**
 * Created for PiJ Coursework 5
 * @author Annabel Jump
 * A Quiz Game
 */

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;


public class QuizGameServerLauncher {

	public static void main(String args[]){
		QuizGameServerLauncher launcher = new QuizGameServerLauncher();
		launcher.launch();
	}
	
	private void launch(){
		if (System.getSecurityManager() == null){
			System.setSecurityManager(new RMISecurityManager());
		}
		try {
			LocateRegistry.createRegistry(1099);
			QuizGameServer server = new QuizGameServer();
			String registryHost = "//localhost/";
			String serviceName = "quiz";
			Naming.rebind(registryHost + serviceName, server);
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex){
			ex.printStackTrace();
		}
	}
	
}
