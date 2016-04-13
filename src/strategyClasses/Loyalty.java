package strategyClasses;

public class Loyalty extends Ranking {

	//Method for calculating rank for the loyal type of gamer.
	@Override
	protected int calculateRanking(Player player) {
		
		int sum = player.getTotGames()+player.getWinns()+player.getLvl();
		
		return sum;
	}

}
