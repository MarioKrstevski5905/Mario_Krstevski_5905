public class AmphibiousCar implements Vehicle, GroundTransport {
    private int fuelCapacity;
    private int passengerCapacity;
    private String terrainType;

    public AmphibiousCar(int fuelCapacity, int passengerCapacity, String terrainType) {
        this.fuelCapacity = fuelCapacity;
        this.passengerCapacity = passengerCapacity;
        this.terrainType = terrainType;
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
}