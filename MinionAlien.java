public class MinionAlien extends Alien {
    
    public MinionAlien() {
	    super(1.0, "Minion Alien", 0.5, 2000);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " is attacking with damage: " + getDamage());
    }

    @Override
    public void move() {
        System.out.println(getName() + " is moving with a speed of " + getMove() + " units per second.");
    }
}
