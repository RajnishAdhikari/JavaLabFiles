package unit1;

public class ProductQ3 {
    private String name;
    private int qty;
    private double price;

    public ProductQ3(String name, int qty, double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public double getTotal() {
        return qty * price;
    }
}

class ProductDemo {
    public static void main(String[] args) {
        ProductQ3 product1 = new ProductQ3("Apple", 10, 0.5);
        ProductQ3 product2 = new ProductQ3("Orange", 15, 0.3);
        double totalPrice = product1.getTotal() + product2.getTotal();
        System.out.println("Total price of both products: " + totalPrice);
    }
}

