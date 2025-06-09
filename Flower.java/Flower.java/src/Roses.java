public class Roses extends FlowerDecorator {
    private String color;

    public Roses(OrderItem orderItem, String color) {
        super(orderItem);
        this.color = color;
    }

    @Override
    public String getDescription() {
        return orderItem.getDescription() + " with " + color;
    }

    @Override
    public double getCost() {
        return orderItem.getCost() + 5.00; // 5 for roses
    }
}