package factoryClasses;

public class WinFactory extends AbstractWinFactory {

	@Override
	protected AbstractWin generateWin(WinSize winSize) {

		switch (winSize) {
		case SMALL:

			return new WinMusic("You win a bounus: \"free download of the music from the game.\" ");

		case MEDIUM:

			return new WinLevel("You win a bounus: \"a higher level in the game.\" ");

		case LARGE:

			return new WinGame("You win a bounus: \"the new game\" ");

		default:
			return null;

		}

	}
}