package task10;

public class OrderManagementSystem {
    public static void main(String[] args) {
        Order order = new Order();
        order.makeOrder();
        System.out.println(order);

        ProductAvailabilityService productAvailabilityService = new ProductAvailabilityService();
        boolean available = productAvailabilityService.getAvailability();
        String availableMsg ="";

        if (available) {
            PaymentService paymentService = new PaymentService();
            int price = paymentService.getPrice();
            availableMsg = "In stock";
            System.out.println("Product availability: " + availableMsg);
            System.out.println("Random price: " + price + " " + paymentService.currency);
        } else {
            availableMsg = "Out of stock";
            System.out.println("Product availability: " + availableMsg);
        }
    }
}
