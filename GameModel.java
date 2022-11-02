import java.util.Queue;

public class GameModel {
	
	////     Attributes
	
	//ArrayList<Board> boards
	//ArrayList<Tile> tiles
	
	//ArrayList<Scene> cards
	
	private int daysLeft;
	
	private Queue<Player> players;
	
	private Player currentPlayer;
	
	////     Constructor
	
	public GameModel() {}
	
	////     Methods
	
	//public ArrayList<Board> getBoards() {return null;}
	
	public int getDaysLeft() {return -1;}
	
	public Player getCurrentPlayer() {return null;}
	
	public void decreaseDaysLeft() {}
	
	public int getRemainingSets() {return -1;}
}
