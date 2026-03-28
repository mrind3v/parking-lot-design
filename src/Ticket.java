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
    private Ticket(Builder builder) {
        this.id = builder.id;
        this.entryTime = builder.entryTime==null ? Instant.now() : builder.entryTime;
        this.numberPlate = builder.numberPlate;
        this.vehicleType = builder.vehicleType;
        this.spotId = builder.spotId;
        this.spotType = builder.spotType;
        this.ticketStatus = builder.ticketStatus;
    }

    public static class Builder {
        private String id;
        private Instant entryTime;
        private String numberPlate;
        private VehicleType vehicleType;
        private String spotId;
        private SpotType spotType;
        private TicketStatus ticketStatus;

        public Builder(String id) {
            this.id = id;
        }

        public Builder entryTime(Instant entryTime) {
            this.entryTime = entryTime;
            return this;
        }
        public Builder numberPlate(String numberPlate) {
            this.numberPlate = numberPlate;
            return this;
        }
        public Builder vehicleType(VehicleType type) {
            this.vehicleType = type;
            return this;
        }
        public Builder spotId(String spotId) {
            this.spotId = spotId;
            return this;
        }
        public Builder spotType(SpotType type) {
            this.spotType = type;
            return this;
        }
        public Builder ticketStatus(TicketStatus status) {
            this.ticketStatus = ticketStatus;
            return this;
        }
        public Ticket build() {
            return new Ticket(this);
        }
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
}
