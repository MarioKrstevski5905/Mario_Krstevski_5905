public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i == 7) {
                break;
            }
            System.out.println("Iteration: " + i);
        }
    }
}