public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Fish fish = new Fish();
        Bird bird = new Bird();
        System.out.println("Lion output:");
        lion.move();
        lion.sleep();
        lion.move();
        System.out.println("Fish output:");
        fish.move();
        fish.sleep();
        fish.move();
        System.out.println("Bird output:");
        bird.move();
        bird.sleep();
        bird.move();
    }
}