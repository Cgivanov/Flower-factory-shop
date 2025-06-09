public class Card extends FlowerDecorator {
    public Card(OrderItem orderItem) {
        super(orderItem);
    }

    @Override
    public String getDescription() {
        return orderItem.getDescription() + ", Card";
    }

    @Override
    public double getCost() {
        return orderItem.getCost() + 4.00; // Adds $4.00 for a card
    }
}