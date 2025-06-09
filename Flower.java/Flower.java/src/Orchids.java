public class Orchids extends FlowerDecorator {
    public Orchids(OrderItem orderItem) {
        super(orderItem);
    }

    @Override
    public String getDescription() {
        return orderItem.getDescription() + ", Orchids";
    }

    @Override
    public double getCost() {
        return orderItem.getCost() + 7.00; // Adds $7.00 for orchids
    }
}