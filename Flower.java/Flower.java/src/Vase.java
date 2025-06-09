public class Vase implements OrderItem {
    @Override
    public String getDescription() {
        return "Vase";
    }

    @Override
    public double getCost() {
        return 24.95; // cost is 24.95
    }
}