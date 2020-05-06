public class Product {
    protected String description;
    protected static int quantityOnHand;
    protected int productId;
    protected double price;
    
    public Product(int productId, String description, int quantityOnHand, double price)
    {
        this.productId = productId;
        this.description = description;
        this.quantityOnHand = quantityOnHand;
        this.price = price;
    }
    public Product()
    {}
    
    public int getProductId()
    {
        return productId;
    }
    
    public void setProductId(int productId)
    {
        this.productId = productId;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public int getQuantityOnHand()
    {
        return quantityOnHand;
    }
    
    public void setQuantityOnHand(int quantityOnHand)
    {
        this.quantityOnHand = quantityOnHand;
    }
    
    
    public double getPrice()
    {
        return price;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public String toString()
    {
        return " Product Id: "+productId+"\n"+" Description: "+description+"\n"+" Quantity On Hand: "+quantityOnHand+"\n"+"  Price: "+price+"\n";
    }
    
}
