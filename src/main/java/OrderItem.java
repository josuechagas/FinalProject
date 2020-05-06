public class OrderItem extends Product{
    private int orderNumber;
    private int lineNumber;
    private int quantity;
    double cost = 0;
    
    public OrderItem(int orderNumber, int lineNumber, int productId, int quantity, double price, String description)
    {
        super(productId, description, quantityOnHand, price);
        this.orderNumber = orderNumber;
        this.lineNumber = lineNumber;
        this.quantity = quantity;   
    }
    public OrderItem()
    {}
    
    public int getOrderNumber()
    {
        return orderNumber;
    }
    
    public void setOrderNumber(int orderNumber)
    {
        this.orderNumber = orderNumber;
    }
    
    public int getLineNumber()
    {
        return lineNumber;
    }
    
    public void setLineNumber(int lineNumber)
    {
        this.lineNumber = lineNumber;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public void setQuantity(int quantity)
    {
        if (quantity < quantityOnHand){
        this.quantity = quantity;
        setQuantityOnHand();}
        else
            System.out.printf("The quantity requested (%d) is above that available.", quantity);
    }
    
    public double getCost()
    {
        return price*quantity;
    }
    
    public int getQuantityOnHand()
    {
        return quantityOnHand;
    }
    
    public void setQuantityOnHand()
    {
        this.quantityOnHand = quantityOnHand-quantity;
    }
    
    public String toString()
    {
        return "  Line Number: "+lineNumber+"\n"+"  Product Id: "+productId+"\n"+"  Quantity: "+quantity+"\n"
                +"  Product Description: "+description+"\n"+"  Price: "+price+"\n"+"  Cost: "+price*quantity+"\n";
    }
    
}
