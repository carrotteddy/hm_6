public class Main {

    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Curtana");
        Weapon skeletonWeapon = new Weapon(WeaponType.BOW, "Wooden bow");
        Boss boss = new Boss(187, 34, bossWeapon);
        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton(78, 10, skeletonWeapon, 23);
        Skeleton skeleton2 = new Skeleton(78, 13, skeletonWeapon, 15);
        System.out.println(skeleton1.printInfo() +"\n" + skeleton2.printInfo());


    }
}