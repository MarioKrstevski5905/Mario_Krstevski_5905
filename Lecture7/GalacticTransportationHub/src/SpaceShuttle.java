public class SpaceShuttle implements Vehicle, AirTransport, SpaceTransport {
    private int fuelCapacity;
    private int passengerCapacity;
    private int maxAltitude;
    private int orbitRange;

    public SpaceShuttle(int fuelCapacity, int passengerCapacity, int maxAltitude, int orbitRange) {
        this.fuelCapacity = fuelCapacity;
        this.passengerCapacity = passengerCapacity;
        this.maxAltitude = maxAltitude;
        this.orbitRange = orbitRange;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void fly() {
        System.out.println("Flying at altitude of " + maxAltitude + " meters");
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void launch() {
        System.out.println("Launching into space");
    }

    public int getOrbitRange() {
        return orbitRange;
    }
}