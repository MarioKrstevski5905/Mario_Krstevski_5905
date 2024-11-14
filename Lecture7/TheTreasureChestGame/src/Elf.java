public class Elf implements MagicalCreature, Guardian, Healer {
    private String name;
    private String treasure;
    private int healingPower;

    public Elf(String name, String treasure, int healingPower) {
        this.name = name;
        this.treasure = treasure;
        this.healingPower = healingPower;
    }

    public void interact() {
        System.out.println(name + " greets you with a warm smile!");
    }

    public void guardTreasure() {
        System.out.println(name + " is guarding the treasure: " + treasure);
    }

    public void healPlayer(int healthPoints) {
        System.out.println(name + " heals you for " + healthPoints + " health points!");
        healingPower = healthPoints;
    }
}
