class Order {

    static int totalOrders = 0;

    Order() {
        totalOrders++;
    }
}

public class odr {
    public static void main(String[] args) {

        Order o1 = new Order();
        Order o2 = new Order();
        Order o3 = new Order();
        Order o4 = new Order();

        System.out.println("Total orders: " + Order.totalOrders);
    }
}