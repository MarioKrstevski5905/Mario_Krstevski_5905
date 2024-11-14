public class Main {

    public static void main(String[] args) {
        AmphibiousCar amphibiousCar = new AmphibiousCar(50, 4, "land and water");
        FlyingCar flyingCar = new FlyingCar(70, 2, "land", 3000);
        SpaceShuttle spaceShuttle = new SpaceShuttle(1000, 7, 10000, 500);

        amphibiousCar.drive();
        System.out.println("Fuel Capacity: " + amphibiousCar.getFuelCapacity());
        System.out.println("Passenger Capacity: " + amphibiousCar.getPassengerCapacity());

        flyingCar.drive();
        flyingCar.fly();
        System.out.println("Fuel Capacity: " + flyingCar.getFuelCapacity());
        System.out.println("Passenger Capacity: " + flyingCar.getPassengerCapacity());

        spaceShuttle.fly();
        spaceShuttle.launch();
        System.out.println("Fuel Capacity: " + spaceShuttle.getFuelCapacity());
        System.out.println("Passenger Capacity: " + spaceShuttle.getPassengerCapacity());

        System.out.println("Max Altitude: " + spaceShuttle.getMaxAltitude());
        System.out.println("Orbit Range: " + spaceShuttle.getOrbitRange());
    }
}