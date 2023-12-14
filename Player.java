public abstract Player {
  private double health;
  private String name;
  private boolean alive;
  private long move;
  
  public Player(String name, double health, boolean alive, long move){
    this.name = name;
    this.health = health;
