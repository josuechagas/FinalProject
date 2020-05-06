import java.util.ArrayList;
public class Order {
    private int orderNumber;
    private int customerId;
    private String date;
    private ArrayList<OrderItem> orderItemArray1 = new ArrayList<>();
    public static int numberOfOrderItems = 0;
    
    public Order(int orderNumber, int customerId, String date)
    {
        this.orderNumber = orderNumber;
        this.customerId = customerId;
        this.date = date;
    }
    public Order()
    {}
    
    public int getOrderNumber()
    {
        return orderNumber;
    }
    
    public void setOrderNumber(int orderNumber)
    {
        this.orderNumber = orderNumber;
    }
    
    public int getcustomerId()
    {
        return customerId;
    }
    
    public void setCustomerId(int customerId)
    {
        this.customerId = customerId;
    }
    
    
    public String getDate()
    {
        return date;
    }
    
    public void setDate(String date)
    {
        this.date = date;
    }
    
    public int getNumberofOrderItems() {
        return orderItemArray1.size();
    }

    public String getOrderItemAt(int index) {
        if (orderItemArray1.get(index) != null) 
        {
            return orderItemArray1.get(index).toString();
        } 
        else {
            return "";
        }
    }
    
    public void addOrderItem(int orderNumber, int lineNumber, int productId, int quantity, double price, String productDescription) {
        orderItemArray1.add( new OrderItem(orderNumber, lineNumber, productId, quantity, price, productDescription));
        
        numberOfOrderItems++;
    }

    public void DelOrderItemAt(int index) {
        orderItemArray1.remove(index);
        numberOfOrderItems--;
    }
    
    
    public String orderItemAt(int Rl) {
        return orderItemArray1.get(Rl).toString();
    }
    
    public String toString()
    {
        return "  Order Number: "+orderNumber+"\n"+"  Customer Id: "+customerId+"\n"+"  Date: "+date+"\n";
    }
}
