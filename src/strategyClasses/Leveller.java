package strategyClasses;

public class Leveller extends Ranking {
	
	//Method for calculating rank for the levelling type of gamer.
	@Override
	protected int calculateRanking(Player player) {
		
		float rank1 = (float) Math.pow(player.getLvl(),2);
		float rank2 = (float) Math.pow(player.getWinns(), 0.8f);
		float rank3 = (float) Math.pow(player.getTotGames(), 0.8f);
		
		int sum = Math.round(rank1 + rank2 + rank3); 
		
		return sum;
	}

}
