import java.util.List;

public class FlowerOrderFactory {
    public static OrderItem createFlowerOrder(String type, List<String> flowers, List<String> extras) {
        OrderItem order = null;

        // Create base order item based on type
        switch (type.toLowerCase()) {
            case "bouquet":
                order = new Bouquet();
                break;
            case "vase":
                order = new Vase();
                break;
            case "table display":
                order = new TableDisplay();
                break;
            default:
                throw new IllegalArgumentException("Unknown product type");
        }

        // Apply flower decorators
        for (String flower : flowers) {
            if (flower.toLowerCase().contains("roses")) {
                String[] parts = flower.split(" ");
                String color = parts[0];
                order = new Roses(order, color);
            } else {
                switch (flower.toLowerCase()) {

                    case "orchids":
                        order = new Orchids(order);
                        break;
                    case "tulips":
                        order = new Tulips(order);
                        break;
                    case "lilies":
                        order = new Lilies(order);
                        break;
                }
            }
        }
        // Apply extra decorators
        for (String extra : extras) {
            switch (extra.toLowerCase()) {
                case "glitter":
                    order = new Glitter(order);
                    break;
                case "card":
                    order = new Card(order);
                    break;
                case "storagevase":
                    order = new StorageVase(order);
                    break;
            }
        }

        return order;
    }
}
