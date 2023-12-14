public class BossAlien extends Alien{
    public BossAlien() {
	    super(3.0, "Boss Alien", 1.0, 2000);
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
