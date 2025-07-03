abstract class Product {
    private String id, name;
    protected double price;

    public Product(String i, String n, double p) {
        id = i;
        name = n;
        price = p;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        price = p;
    }

    public abstract double calcDiscount();
}

interface Taxable {
    double calcTax();

    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(String i, String n, double p) {
        super(i, n, p);
    }

    public double calcDiscount() {
        return getPrice() * 0.1;
    }

    public double calcTax() {
        return getPrice() * 0.15;
    }

    public String getTaxDetails() {
        return "15% tax";
    }
}

class Clothing extends Product implements Taxable {
    public Clothing(String i, String n, double p) {
        super(i, n, p);
    }

    public double calcDiscount() {
        return getPrice() * 0.2;
    }

    public double calcTax() {
        return getPrice() * 0.05;
    }

    public String getTaxDetails() {
        return "5% tax";
    }
}

class Groceries extends Product {
    public Groceries(String i, String n, double p) {
        super(i, n, p);
    }

    public double calcDiscount() {
        return 0;
    }
}

public class Store {
    public static void showPrice(Product p) {
        double discount = p.calcDiscount();
        double tax = (p instanceof Taxable) ? ((Taxable) p).calcTax() : 0;
        System.out.println(p.getClass().getSimpleName() + " final: " + (p.getPrice() + tax - discount));
    }

    public static void main(String[] args) {
        Product[] items = { new Electronics("E1", "TV", 500), new Clothing("C1", "Shirt", 50),
                new Groceries("G1", "Rice", 20) };
        for (Product p : items)
            showPrice(p);
    }
}