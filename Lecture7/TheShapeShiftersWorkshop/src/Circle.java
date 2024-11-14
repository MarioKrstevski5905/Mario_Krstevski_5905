class Circle implements TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        System.out.println("A new circle has been created.");
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
