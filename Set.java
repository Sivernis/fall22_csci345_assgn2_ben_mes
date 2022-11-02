class Set extends Tile
{
    private Role[] roles;
    private Scene scene;
    private int shotCounter;

    public Set(String name, Tile[] adjacentTiles, Role[] roles, Scene scene)
    {

        super(name, adjacentTiles);
        this.roles = roles;
        this.scene = scene;
    }

    public Role[] getRoles() {return null;}
    
    public Scene getCurrentScene() {return null;}

    public Scene getShotCounter() {return null;}
    public void decrementShotCounter() {}

    public void reset() {}



}