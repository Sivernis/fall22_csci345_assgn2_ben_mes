class Tile
{
    private String name;
    private Tile[] adjTiles;

    public Tile(String name, Tile[] adjTiles)
    {
        this.name = name;
        this.adjTiles = adjTiles;
    }

    public Tile[] GetAdjacentTiles() {return null;}
}