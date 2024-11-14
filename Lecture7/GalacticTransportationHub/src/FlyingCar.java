public class FlyingCar implements Vehicle, GroundTransport, AirTransport {
    private int fuelCapacity;
    private int passengerCapacity;
    private String terrainType;
    private int maxAltitude;

    public FlyingCar(int fuelCapacity, int passengerCapacity, String terrainType, int maxAltitude) {
        this.fuelCapacity = fuelCapacity;
        this.passengerCapacity = passengerCapacity;
        this.terrainType = terrainType;
        this.maxAltitude = maxAltitude;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void drive() {
        System.out.println("Driving on " + terrainType);
    }

    public String getTerrainType() {
        return terrainType;
    }

    public void fly() {
        System.out.println("Flying at altitude of " + maxAltitude + " meters");
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }
}
