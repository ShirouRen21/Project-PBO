public class EliteAlien extends Alien {
   
    public EliteAlien() {
	    super(2.0, "Elite Alien", 0.5, 2000);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " is attacking with damage: " + getDamage());
    }

    @Override
    public void move() {
        System.out.println(getName() + " is moving with a speed of " + getMovement() + " units per second.");
    }

}
