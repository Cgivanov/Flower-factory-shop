public class TableDisplay implements OrderItem {
    @Override
    public String getDescription() {
        return "Table Display";
    }

    @Override
    public double getCost() {
        return 45.95; // cost is 49.95
    }
}