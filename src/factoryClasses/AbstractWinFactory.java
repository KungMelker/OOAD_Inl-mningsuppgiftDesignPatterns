package factoryClasses;



public abstract class AbstractWinFactory {

	//The calculation of wins and calls for the winFactory. Take in players rankings from client.
	public String calculateWinn(int[] pRankings) {

		WinFactory winFactory = new WinFactory();	
		String results = "";

		for (int rankType = 0; rankType < pRankings.length; rankType++) {

			if (pRankings[rankType] < 28) {
				results += "Im sorry, you need to get higer ranking to win a bounus " + motivation(rankType);;

			} else if (pRankings[rankType] >= 28 && pRankings[rankType] < 32)  {
				results += winFactory.generateWin(WinSize.SMALL) + motivation(rankType);
				
			} else if (pRankings[rankType] >= 32 && pRankings[rankType] <= 44)  {

				results += winFactory.generateWin(WinSize.MEDIUM) + motivation(rankType);
				
			} else if (pRankings[rankType] > 44)  {
				results += winFactory.generateWin(WinSize.LARGE) + motivation(rankType);
				
			}
		}
		return results;
	}
	
	//This method take the rank types and return a little motivation.
	private String motivation(int rankType){
		
		
		return (rankType == 0 ? "for your loyalty!" : "") + (rankType == 1 ? "for being a winner!" : "") + (rankType == 2 ? "for your hig lvl!" : "")+"\n";
	}
	
	
	
	protected abstract AbstractWin generateWin(WinSize winSize);
}
