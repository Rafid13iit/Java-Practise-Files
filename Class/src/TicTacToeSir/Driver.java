package TicTacToeSir;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameLogic game = new GameLogic(new ConsoleInputOutput());
		game.play();
	}

}
