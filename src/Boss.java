public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public Boss(int health, int damage, Weapon weapon) {
        super(health, damage);
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "Boss Health " + getHealth() + " Boss damage " + getDamage() + " Boss weapon " +
                getWeapon().getWeaponType() + " " + getWeapon().getNameOfWeapon();
    }
}
