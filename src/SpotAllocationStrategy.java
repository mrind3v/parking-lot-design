import java.util.List;

public interface SpotAllocationStrategy {
    // spot allocation strategy for every floor
    ParkingSpot findSpot(List<Floor> floors, VehicleType type);
}
