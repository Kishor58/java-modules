package Classes_In_Java;

public class EnumClass {
    private OrderStatus status;

    public EnumClass() {
        status = OrderStatus.PENDING;
    }

    public void updateStatus(OrderStatus status) {
        this.status = status;
    }

    public void printStatus() {
        System.out.println("Current order status: " + status);
    }

    public static void main(String[] args) {
        EnumClass order = new EnumClass();
        order.printStatus();
        order.updateStatus(OrderStatus.SHIPPED);
        order.printStatus();
    }
}
enum OrderStatus {
    PENDING, SHIPPED, DELIVERED, CANCELLED;
}

