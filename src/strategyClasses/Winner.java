package strategyClasses;

public class Winner extends Ranking {
	
	//Method for calculating rank for the winning type of gamer.
	@Override
	protected int calculateRanking(Player player) {

		float rank1 = (float) Math.sqrt(player.getTotGames());
		float rank2 = (float) player.getWinns() * 2.5f;
		float rank3 = (float) player.getLvl();
		
		int sum = Math.round(rank1 + rank2 + rank3);

		return sum;
	}

}
