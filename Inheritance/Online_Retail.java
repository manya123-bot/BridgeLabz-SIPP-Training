class Order {
    String orderId, orderDate;

    Order(String id, String date) {
        orderId = id;
        orderDate = date;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String id, String date, String track) {
        super(id, date);
        trackingNumber = track;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String id, String date, String track, String delDate) {
        super(id, date, track);
        deliveryDate = delDate;
    }

    void getOrderStatus() {
        System.out.println("Order ID: " + orderId + ", Delivered on: " + deliveryDate);
    }
}

