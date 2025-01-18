package ku.shop;

public class OrderItem {
    private final int quantity;
    private final Product prod;

    public OrderItem(Product prod, int quantity) {
        this.prod = prod;
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return prod.getPrice() * quantity;
    }
}
