public class Vehicle {
    private String model;
    private int noPassengers;
    private double getTankCapacity;
    private double fuelConsumption;

    public Vehicle(String model, int noPassengers, double getTankCapacity, double fuelConsumption) {
        this.model = model;
        this.noPassengers = noPassengers;
        this.getTankCapacity = getTankCapacity;
        this.fuelConsumption = fuelConsumption;
    }
    public double calculateDistance(){
        return getTankCapacity / fuelConsumption;
    }
    public void compareRange(Vehicle vehicle2){
        if(calculateDistance() > vehicle2.calculateDistance()){
            System.out.println("Vehicle " + model + " has a greater range then " + vehicle2.model);
        }else if(calculateDistance() < vehicle2.calculateDistance()){
            System.out.println("Vehicle " + vehicle2 + " has a greater range then " + model);
        }else {
            System.out.println("Vehicles have the same range. ");
        }
    }
}
