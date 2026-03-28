public class ParkingSpot {
    private final String id;
    private final SpotType spotType;
    private Vehicle parkedVehicle;
    ParkingSpot(String id, SpotType spotType) {
        this.id = id;
        this.spotType = spotType;
    }

    public String getId() {
        return id;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public Vehicle getParkedVehicle() {
        return this.parkedVehicle;
    }

    public boolean isFree() {
        return parkedVehicle==null;
    }

    public void park(Vehicle vehicle) {
        if (!isFree()) {
            throw new IllegalStateException("Parking spot is occupied. Cannot park");
        }
        this.parkedVehicle = vehicle;
    }

    public Vehicle unpark() {
        if (isFree()) {
            throw new IllegalStateException("Parking spot is already free!");
        }
        Vehicle v = this.parkedVehicle;
        this.parkedVehicle = null;
        return v;
    }
}
