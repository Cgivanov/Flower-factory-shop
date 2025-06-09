public class Tulips extends FlowerDecorator {
    public Tulips(OrderItem orderItem) {
        super(orderItem);
    }

    @Override
    public String getDescription() {
        return orderItem.getDescription() + ", Tulips";
    }

    @Override
    public double getCost() {
        return orderItem.getCost() + 4.50; // Adds 4.50 for tulips
    }
}
