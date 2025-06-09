public class Glitter extends FlowerDecorator {
    public Glitter(OrderItem orderItem) {
        super(orderItem);
    }

    @Override
    public String getDescription() {
        return orderItem.getDescription() + ", Glitter";
    }

    @Override
    public double getCost() {
        return orderItem.getCost() + 2.00; // Adds $2.00 for glitter
    }
}
