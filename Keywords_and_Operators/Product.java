public class Product {
    private static double discount = 0.10;
    private static int totalProducts = 0;

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    private String productName;
    private double price;
    private int quantity;
    private final String productID;

    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
        totalProducts++;
    }

    public void processDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Product ID: " + productID);
        System.out.println("Discount: " + (discount * 100) + "%");
    }

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200.00, 2, "PROD001");
        if (product1 instanceof Product) {
            product1.processDetails();
        }
        Product.updateDiscount(0.15);
        Product product2 = new Product("Smartphone", 800.00, 3, "PROD002");
        if (product2 instanceof Product) {
            product2.processDetails();
        }
    }
}