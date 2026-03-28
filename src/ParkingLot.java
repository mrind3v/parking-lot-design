import java.util.List;

public class ParkingLot {
    private static volatile ParkingLot instance;
    private final List<Floor> floors;
    private final ParkingService parkingService;

    private ParkingLot(List<Floor> floors, ParkingService parkingService) {
        this.floors = floors;
        this.parkingService = parkingService;
    }

    public static ParkingLot getInstance(List<Floor> floors, ParkingService parkingService) {
        if (instance == null) {
            synchronized (ParkingLot.class) {
                if (instance == null) {
                    instance = new ParkingLot(floors, parkingService);
                }
            }
        }
        return instance;
    }

    public Ticket park(Vehicle vehicle) {
        return parkingService.park(vehicle);
    }

    public PaymentReceipt unpark(Ticket ticket, PaymentMode mode, FeeCalculationStrategy strategy) {
        return parkingService.unpark(ticket, strategy, mode);
    }

    public List<Floor> getFloors() {
        return floors;
    }
}