
public class Player {

	////     Attributes
	
	private String name;
	private int rank;
	private int dollars;
	private int credits;
	private int practiceChips;
	//private Tile correntTile;
	//private Location currentLocation;
	//private Role currentRole;
	
	////     Constructor
	
	public Player() {}
	
	////     Methods
	
	public String getName() {return null;}
	
	//public String getCurrentLocation() {}
	//public String getCurrentTile() {}
	
	public int getRank() {return -1;}
	
	//public void setLocation(Location) {}
	//public void setTile(Tile) {}
	
	public int rollDie() {return -1;}
	
	public void addCredits(int credits) {}
	
	public void addDollars(int dollars) {}
	
	public void addPracticeChip() {}
	
	//public void moveToLocation(Location) {}
	//public void moveToTile(Tile) {}
	
	public void takeRole(Role role) {}
	
	public void act() {}
	
	public void rehearse() {}
	
	public void increaseRank() {}
}
