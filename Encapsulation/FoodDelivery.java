abstract class FoodItem {
    private String itemName;
    protected double price;
    protected int quantity;

    public FoodItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }

    public String getDetails() {
        return itemName + " x" + quantity + " @ $" + price;
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    void applyDiscount(double percentage);

    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    private double discount = 0;

    public VegItem(String name, double p, int q) {
        super(name, p, q);
    }

    public double calculateTotalPrice() {
        return price * quantity;
    }

    public void applyDiscount(double p) {
        discount = p;
    }

    public String getDiscountDetails() {
        return "Veg discount: " + (discount * 100) + "%";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0;

    public NonVegItem(String name, double p, int q) {
        super(name, p, q);
    }

    public double calculateTotalPrice() {
        return (price + 2) * quantity;
    } // extra charge

    public void applyDiscount(double p) {
        discount = p;
    }

    public String getDiscountDetails() {
        return "NonVeg discount: " + (discount * 100) + "%";
    }
}

public class FoodDelivery {
    static void processOrder(FoodItem item) {
        double total = item.calculateTotalPrice();
        if (item instanceof Discountable) {
            Discountable disc = (Discountable) item;
            disc.applyDiscount(0.1); // example 10% discount
            total -= total * 0.1;
            System.out.println(item.getDetails() + ", Total after discount: $" + total);
            System.out.println(disc.getDiscountDetails());
        }
    }

    public static void main(String[] args) {
        FoodItem[] order = {
                new VegItem("Salad", 5, 2),
                new NonVegItem("Chicken", 8, 3)
        };
        for (FoodItem item : order) {
            processOrder(item);
        }
    }
}