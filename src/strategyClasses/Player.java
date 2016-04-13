package strategyClasses;

public class Player {

	private Ranking ranking;
	private int winns, totGames, lvl;

	public Player(int winns, int totGames, int lvl) {
		super();
		this.ranking = null;
		this.winns = winns;
		this.totGames = totGames;
		this.lvl = lvl;
	}

	public int getWinns() {
		return winns;
	}

	public void setWinns(int winns) {
		this.winns = winns;
	}

	public int getTotGames() {
		return totGames;
	}

	public void setTotGames(int totGames) {
		this.totGames = totGames;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public Ranking getRanking() {
		return ranking;
	}

	public void setRanking(Ranking ranking) {
		this.ranking = ranking;
	}
	

	//Finding out how high level in all three stats.
	public int[] getAllRankings(Player player) {

		int[] pRankings = new int[3];

		for (int i = 0; i < 3; i++) {

			switch (i) {
			case 0:
				player.setRanking(new Loyalty());
				pRankings[i] = ranking.calculateRanking(player);
				break;

			case 1:
				player.setRanking(new Winner());
				pRankings[i] = ranking.calculateRanking(player);
				break;

			default:
				player.setRanking(new Leveller());
				pRankings[i] = ranking.calculateRanking(player);
				break;
			}

		}
		return pRankings;
	}

}
