class Square implements TwoDimensionalShape {
    private double side;

    public Square(double side) {
        this.side = side;
        System.out.println("A new square has been created.");
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }
}