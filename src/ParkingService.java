import java.time.Instant;
import java.util.List;

public class ParkingService {
    List<Floor> floors;
    private final PaymentService paymentService;
    private final SpotAllocationStrategy spotAllocationStrategy;
    ParkingService(List<Floor> floors, PaymentService paymentService, SpotAllocationStrategy spotAllocationStrategy) {
        this.floors = floors;
        this.paymentService = paymentService;
        this.spotAllocationStrategy = spotAllocationStrategy;
    }

    public Ticket park(Vehicle vehicle) {
        ParkingSpot spot = spotAllocationStrategy.findSpot(vehicle.getVehicleType());
        if (spot==null) {
            System.out.println("No spot available...");
            return null;
        }
        spot.setStatus(SpotStatus.OCCUPIED);

        return new Ticket.Builder("123")
                .entryTime(Instant.now())
                .numberPlate(vehicle.getNumberPlate())
                .vehicleType(vehicle.getVehicleType())
                .spotId(spot.getId())
                .spotType(spot.getSpotType())
                .ticketStatus(TicketStatus.ACTIVE)
                .build();
    }

    public PaymentReceipt unpark(Ticket ticket, FeeCalculationStrategy feeCalculationStrategy, PaymentMode mode) {
        PaymentReceipt receipt = paymentService.process(ticket,feeCalculationStrategy, mode);
        return receipt;
    }
}
