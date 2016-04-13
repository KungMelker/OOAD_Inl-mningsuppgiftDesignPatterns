package Client;

import factoryClasses.AbstractWinFactory;
import factoryClasses.WinFactory;
import strategyClasses.Player;

public class Client {

	public static void main(String[] args) {
	
	 //Making all the players	
	 Player player1 = new Player(11, 32, 2);
	 Player player2 = new Player(15, 21, 4);
	 Player player3 = new Player(12, 24, 5);
	 
	 //Generate the players rankings
	 int[] p1Rankings = player1.getAllRankings(player1);
	 int[] p2Rankings = player2.getAllRankings(player2);
	 int[] p3Rankings = player3.getAllRankings(player3);
	 
	 //Making a win factory
	 AbstractWinFactory wf1 = new WinFactory(); 
	 
	 
	 //Showing the players rewards 
	 System.out.println("Player 1");
	 System.out.println(wf1.calculateWinn(p1Rankings));
	 
	 
	 System.out.println("Player 2");
	 System.out.println(wf1.calculateWinn(p2Rankings));
	 
	 
	 System.out.println("Player 3");
	 System.out.println(wf1.calculateWinn(p3Rankings));
	 
	}

}
