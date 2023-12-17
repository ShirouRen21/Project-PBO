public class Item {
    private int health;
    private int rarity;
    private long spawnRate;

    public Item(int health, long spawnRate, int rarity) {
        this.health = health;
        this.spawnRate = spawnRate;
        this.rarity = rarity;
    }

    public void setItemHealth(int health) {
        this.health = health;
    }

    public int getItemHealth() {
        return health;
    }

    public void setItemRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getItemRarity() {
        return rarity;
    }

    public void setItemSpawnRate(long spawnRate) {
        this.spawnRate = spawnRate;
    }

    public long getItemSpawnRate() {
        return spawnRate;
    }
}
