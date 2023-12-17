public class Player {
    private String name;
    private double health;
    private boolean alive;
    private long movement;

    public Player(String name, double health, boolean alive, long movement) {
        this.name = name;
        this.health = health;
        this.alive = alive;
        this.movement = movement;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHealth() {
        return health;
    }

    public void setMovement(long movement) {
        this.movement = movement;
    }

    public long getMovement() {
        return movement;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }
}
