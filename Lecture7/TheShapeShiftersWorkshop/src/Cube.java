class Cube implements ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        this.side = side;
        System.out.println("A new cube has been created.");
    }

    public double volume() {
        return side * side * side;
    }
}
