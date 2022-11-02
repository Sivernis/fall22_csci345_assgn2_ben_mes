class Scene
{
    private String name;
    private String description;
    private int budget;
    private Role[] roles;
    private bool revealed;
    private bool complete;

    public Scene(String name, String description, int budget, Role[] roles)
    {
        this.name = name;
        this.description = description;
        this.budget = budget;
        this.roles = roles;
        this.revealed = false;
        this.complete = false;
    }

    public int getBudget() {return null;}

    public Role[] getRoles() {return null;}

    public boolean isrevealed() {return null;}
    public void reveal() {}

    public boolean isComplete() {return null;}
    public void complete() {}

}