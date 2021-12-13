package baitapphantichgame;

public class Game {
	protected String game2D;
	protected String gameMobi;
	protected void choiGame() {
		System.out.println("choi game");
	}
	public String getGame2D() {
		return game2D;
	}
	public void setGame2D(String game2d) {
		game2D = game2d;
	}
	public String getGameMobi() {
		return gameMobi;
	}
	public void setGameMobi(String gameMobi) {
		this.gameMobi = gameMobi;
	}
}
