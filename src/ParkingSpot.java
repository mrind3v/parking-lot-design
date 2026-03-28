public class ParkingSpot {
    private final String id;
    private final SpotType spotType;
    // we do not make the parkedVehicle field private as this field can be changed after creation of the parking spot as well`
    private Vehicle parkedVehicle;
    private SpotStatus status;
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

    public void setStatus(SpotStatus status) {
        this.status = status;
    }

/*    public void park(Vehicle vehicle) {
        if (!isFree()) {
            throw new IllegalStateException("Parking spot " + this.id + " is occupied. Cannot park");
        }
        this.parkedVehicle = vehicle;
    }

    public Vehicle unpark() {
        if (isFree()) {
            throw new IllegalStateException("Parking spot" + this.id + " is already free!");
        }
        Vehicle v = this.parkedVehicle;
        this.parkedVehicle = null;
        return v;
    }*/
}
