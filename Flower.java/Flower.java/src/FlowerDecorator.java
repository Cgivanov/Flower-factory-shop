public abstract class FlowerDecorator implements OrderItem {
    protected OrderItem orderItem;

    public FlowerDecorator(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    @Override
    public abstract String getDescription();

    @Override
    public abstract double getCost();
}