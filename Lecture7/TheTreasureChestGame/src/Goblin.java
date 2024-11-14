public class Goblin implements MagicalCreature, Guardian, Curser {
    private String name;
    private String treasure;
    private int curseDamage;

    public Goblin(String name, String treasure, int curseDamage) {
        this.name = name;
        this.treasure = treasure;
        this.curseDamage = curseDamage;
    }

    public void interact() {
        System.out.println(name + " cackles mischievously at you!");
    }

    public void guardTreasure() {
        System.out.println(name + " is guarding the treasure: " + treasure);
    }

    public void castCurse(int damagePoints) {
        System.out.println(name + " casts a curse dealing " + damagePoints + " damage!");
        curseDamage = damagePoints;
    }
}