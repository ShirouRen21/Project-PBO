public abstract class Alien {
  
  private double health;
  private String name;
  private double damage;
  private long movement;

  public Alien (double health, String name, double damage, long movement){
    this.health = health;
    this.name = name;
    this.damage = damage;
    this.movement = movement;
  }

  public void setHealth(double health){
    this.health = health;
  }
  
  public void setDamage(double damage){
    this.damage = damage;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  public void setMove(long movement){
    this.movement = movement;
  }

  public double getHealth(){
    return health;
  }
  
  public double getDamage(){
    return damage;
  }
  
  public String getName(){
    return name;
  }
  
  public long getMovement(){
    return movement;
  }

  public abstract void attack();
  public abstract void move();

}
