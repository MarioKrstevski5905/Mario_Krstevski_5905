public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Circle circle = new Circle(3);
        Cube cube = new Cube(4);

        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        System.out.println("Cube Volume: " + cube.volume());
    }
}