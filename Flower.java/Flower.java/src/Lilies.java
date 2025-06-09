public class Lilies extends FlowerDecorator {
    public Lilies(OrderItem orderItem) {
        super(orderItem);
    }

    @Override
    public String getDescription() {
        return orderItem.getDescription() + ", Lilies";
    }

    @Override
    public double getCost() {
        return orderItem.getCost() + 4.99; // Adds $4.99 for lilies
    }
}