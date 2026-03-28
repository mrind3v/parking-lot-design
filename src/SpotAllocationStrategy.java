public interface SpotAllocationStrategy {
    Ticket findSpot(VehicleType type);
}
