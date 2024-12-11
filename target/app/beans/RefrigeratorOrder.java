package beans;

public class RefrigeratorOrder {
    private String itemName;
    private int quantity;
    private String orderDate;

    // Constructor
    public RefrigeratorOrder(String itemName, int quantity, String orderDate) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.orderDate = orderDate;
    }

    // Getters and Setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
}
