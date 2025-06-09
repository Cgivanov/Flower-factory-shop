public class StorageVase extends FlowerDecorator {
    public StorageVase(OrderItem orderItem) {
        super(orderItem);
    }

    @Override
    public String getDescription() {
        return orderItem.getDescription() + ", Storage Vase";
    }

    @Override
    public double getCost() {
        return orderItem.getCost() + 5.00; // Adds $5.00 for a storage vase
    }
}