import java.util.*;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<OrderItem> orders = new ArrayList<>();
        String input;

        System.out.println("\nWelcome to Christian's Flower Shop!");

        while (true) {
            System.out.println("\nWhat would you like to order?");
            System.out.println("1. Bouquet ($15.95)");
            System.out.println("2. Vase ($24.95)");
            System.out.println("3. Table Display ($45.95)");
            System.out.println("4. Large Display ($30.95)");
            System.out.println("0. Finish order");

            input = sc.nextLine();

            if (input.equals("0")) {
                break;
            }

            String type = null;
            switch (input) {
                case "1":
                    type = "bouquet";
                    break;
                case "2":
                    type = "vase";
                    break;
                case "3":
                    type = "table display";
                    break;
                case "4":
                    type = "large display";
                    break;
            }
            // types of flowers
            List<String> flowers = new ArrayList<>();
            System.out.println("What flowers would you like to add?");
            System.out.println("1. Roses($5)");
            System.out.println("2. Orchids($7)");
            System.out.println("3. Tulips($4.50)");
            System.out.println("4. Liles($4.99)");
            System.out.println("0. Done");

            while (true) {
                String flowerInput = sc.nextLine();
                if (flowerInput.equals("0")) {
                    break;
                }

                switch (flowerInput) {
                    case "1":
                        System.out.println("Select a color for roses:"); // have one choice to pick color and then clikc
                                                                         // 0 to move on the extra decorator
                        System.out.println("1. Yellow");
                        System.out.println("2. Red");
                        System.out.println("3. Purple");
                        System.out.println("4. White");
                        String colorInput = sc.nextLine();
                        String color = "";
                        switch (colorInput) {
                            case "1":
                                color = "yellow";
                                break;
                            case "2":
                                color = "red";
                                break;
                            case "3":
                                color = "purple";
                                break;
                            case "4":
                                color = "white";
                                break;
                        }
                        flowers.add(color + "roses");
                        break;
                    case "2":
                        flowers.add("orchids");
                        break;
                    case "3":
                        flowers.add("tulips");
                        break;
                    case "4":
                        flowers.add("liles");
                        break;
                }
            }
            // extra decorations
            List<String> extras = new ArrayList<>();
            System.out.println("What extras would you like?");
            System.out.println("1. Glitter (+$2.00)");
            System.out.println("2. Card (+$4.00)");
            System.out.println("3. Storage Vase (+$5.00)");
            System.out.println("0. Done");

            while (true) {
                String extraInput = sc.nextLine();
                if (extraInput.equals("0")) {
                    break;
                }

                switch (extraInput) {
                    case "1":
                        extras.add("glitter");
                        break;
                    case "2":
                        extras.add("card");
                        break;
                    case "3":
                        extras.add("storage vase");
                        break;
                }
            }

            // Create and add the order
            OrderItem order = FlowerOrderFactory.createFlowerOrder(type, flowers, extras);
            orders.add(order);
        }

        // Print the invoice
        double total = 0.0;
        double taxRate = 0.085; // 8.5 tax rate
        for (OrderItem order : orders) {
            System.out.println(order.getDescription() + " : $" + order.getCost());
            total += order.getCost();
        }
        double tax = total * taxRate;
        double totalWithTax = total + tax;

        /// here is the invoice
        System.out.println("\nThe Invoice:");
        System.out.printf("Subtotal : $%.2f\n", total);
        System.out.printf("Tax (8.5%%): $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", totalWithTax);
        // Close the Scanner
        sc.close();
    }
}