public class GameEntity {
    private int Health;
    private int damage;

    public GameEntity(int health, int damage) {
        Health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
