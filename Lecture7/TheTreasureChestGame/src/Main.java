public class Main {

    public static void main(String[] args) {
        Dragon dragon = new Dragon("Smaug", "Golden Crown", 50);
        Elf elf = new Elf("Legolas", "Elven Ring", 30);
        Goblin goblin = new Goblin("Gobby", "Silver Coin", 20);

        dragon.interact();
        dragon.guardTreasure();
        dragon.castCurse(50);

        elf.interact();
        elf.guardTreasure();
        elf.healPlayer(30);

        goblin.interact();
        goblin.guardTreasure();
        goblin.castCurse(20);
    }
}