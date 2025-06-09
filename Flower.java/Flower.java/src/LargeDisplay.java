public class LargeDisplay implements OrderItem {
    @Override
    public String getDescription() {
        return "Large display";
    }

    @Override
    public double getCost() {
        return 30.95; // cost is 30.95
    }
}
