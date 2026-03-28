public class PaymentService {
    private final FeeCalculationStrategy feeCalculationStrategy;
    PaymentService(FeeCalculationStrategy feeCalculationStrategy) {
        this.feeCalculationStrategy = feeCalculationStrategy;
    }
    PaymentReceipt process(Ticket ticket, FeeCalculationStrategy feeCalculationStrategy, PaymentMode paymentMode) {
        int amount = feeCalculationStrategy.calculate(ticket);
        return new PaymentReceipt("987", amount, paymentMode,PaymentStatus.SUCCESS);
    }
}
