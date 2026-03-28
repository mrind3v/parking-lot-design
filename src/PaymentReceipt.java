public class PaymentReceipt {
    private final String id;
    private final int amount;
    private final PaymentMode mode; // this is final because when we pay, we pay thru a single mode and don't change it
    private PaymentStatus status; // not final as payment status should be updated after payment
    PaymentReceipt(String id, int amount, PaymentMode mode, PaymentStatus status) {
        this.id = id;
        this.amount = amount;
        this.mode = mode;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public PaymentMode getMode() {
        return mode;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
