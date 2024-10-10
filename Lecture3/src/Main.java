import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int i = 0;
        int r;
        while (i < 10) {
            r = random.nextInt(500) + 1;
            System.out.println(" br " + r);
            i++;
        }


        do {
            r = random.nextInt(500) + 1;}
            while (r > 300);

                int counter = 0;

                for (int j = 0; j <= 20; j++) {
                    int a = random.nextInt(500) + 1;
                    System.out.printf(a + " ");
                    if (a % 2 == 0) {
                        counter++;
                    }
                }
                System.out.println(" There were " + counter + " even numbers.");
                while (true) {
                    int b = random.nextInt(500) + 1;
                    if (b % 7 == 0) {
                        System.out.println("The number " + b + " is divisible by 7 ");
                        break;
                    }
                }
            }
        }


