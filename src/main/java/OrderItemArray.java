
import java.util.ArrayList;

public class OrderItemArray extends ArrayList{
    
    static ArrayList<OrderItem> orderItems = new ArrayList<>();
    
    public static void createOrderItem(OrderItem oIts) {
        orderItems.add(oIts);
    }
    
    public static String getAllOrderItems() {
        String ordits = "";
        for (int i = 0; i < orderItems.size(); i++) {
            ordits += orderItems.get(i)+"\n";
        }
        return ordits;
    }
}

