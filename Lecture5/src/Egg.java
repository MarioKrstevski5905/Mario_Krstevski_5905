public class Egg {
    public void Egg() {
        System.out.println("Each egg has an albumen and a yolk.");
    }
    public void print() {
        System.out.println("The egg is a nutritional product.");
    }
}

class OstrichEgg extends Egg {
    @Override
    public void Egg() {
        System.out.println("The albumen and the yolk of the ostrich are the largest.");
    }
}