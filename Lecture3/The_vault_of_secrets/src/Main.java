
public class Main {
    public static void main(String[] args) {
        int[] A = new int[15];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 101);
        }
        int countDivisibleBy3 = 0;
        for (int number : A) {
            if (number % 3 == 0) {
                countDivisibleBy3++;
            }
        }
        System.out.println("Numbers divisible by 3: " + countDivisibleBy3);
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = 100 - A[i];
        }
        System.out.print("Array A: ");
        printArray(A);
        System.out.print("Array B: ");
        printArray(B);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}