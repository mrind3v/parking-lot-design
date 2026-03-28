import java.time.Instant;

public class Ticket {
    private final String id;
    private final Instant entryTime;
    private final String numberPlate;
    private final VehicleType vehicleType;
    private final String spotId;
    private final SpotType spotType;
    // we do not make TicketStatus as private as we need to update the ticket object later
    // after creating it
    private TicketStatus ticketStatus;
    Ticket(String id, Instant entryTime, String numberPlate, VehicleType vehicleType, String spotId, SpotType spotType, TicketStatus ticketStatus) {
        this.id = id;
        this.entryTime = Instant.now();
        this.numberPlate = numberPlate;
        this.vehicleType = vehicleType;
        this.spotId = spotId;
        this.spotType = spotType;
        this.ticketStatus = ticketStatus;
    }

    public String getId() {
        return id;
    }

    public Instant getEntryTime() {
        return entryTime;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getSpotId() {
        return spotId;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus status) {
        this.ticketStatus = status
    }
}
