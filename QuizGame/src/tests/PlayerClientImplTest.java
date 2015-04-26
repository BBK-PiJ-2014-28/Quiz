package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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

public class PlayerClientImplTest {
	
	List<Quiz> quizList = new ArrayList<Quiz>();
	List<Player> playerList = new ArrayList<Player>();
	PlayerClient testClient;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
