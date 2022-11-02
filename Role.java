class Role
{
    private String name;
    private String quote;
    private int rank;
    private boolean occupied;
    private boolean  complete;

    public Role(String name, String quote, int rank)
    {
        this.name = name;
        this.quote = quote;
        this.rank = rank;
        occupied = false;
        complete = false;
    }

    public int getRank() {return null;}

    public boolean  isOccupied() {return null;}
    public void setOcupied(boolean  occupied) {}
    
    public boolean  isComplete() {return null;}
    public void complete() {}

    public void reset() {}



}