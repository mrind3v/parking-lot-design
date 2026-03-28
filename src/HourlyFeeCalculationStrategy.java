public class HourlyFeeCalculationStrategy implements FeeCalculationStrategy {
    @Override
    public int calculate(Ticket ticket) {
        System.out.println("Hourly calculation logic in progress...");
        return 100;
    }
}
