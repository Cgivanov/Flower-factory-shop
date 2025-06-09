public class Bouquet implements OrderItem {
    @Override
    public String getDescription() {
        return "Bouquet";
    }

    @Override
    public double getCost() {
        return 15.95; // cost is 15.95
    }
}
