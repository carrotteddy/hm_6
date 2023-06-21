public class Skeleton extends Boss {
    private int arrowCount;

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    public Skeleton(int health, int damage, Weapon weapon, int arrowCount) {
        super(health, damage, weapon);
        this.arrowCount = arrowCount;
    }

    public String printInfo() {
        return "SKELETON HEALTH: " + getHealth() + " SKELETON DAMAGE: " + getDamage() + " SKELETON WEAPON: "
                + getWeapon().getNameOfWeapon() + " ARROW COUNT: " + getArrowCount();
    }
}
