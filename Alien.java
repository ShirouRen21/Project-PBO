public abstrak class Alien {
  
  private double health;
  private String name;
  private double damage;
  private long move;

  public Alien (double health, String name, double damage, long move){
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
  
  public void setName(Sting name){
    this.name = name;
  }
  
  public void setMove(long move){
    this.move = move;
  }

  public double getHealth(){
    return health;
  }
  
  public double getDamage(){
    return damage;
  }
  
  public string getName(){
    return name;
  }
  
  public long getMove(){
    return move;
  }

}
