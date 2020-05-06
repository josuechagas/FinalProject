import java.util.ArrayList;

public class Customer {
    private String firstname;
    private String lastname;
    private int id;
    private String phonenumber;
    private ArrayList<Order> orderArray1 = new ArrayList<Order>();
    public static int numberOfOrders = 0;
    double totCost = 0;
    
    public Customer(String firstname, String lastname, String phonenumber, int id)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.id = id;
    }
    public Customer()
    {}
    
    public String getFirstName()
    {
        return firstname;
    }
    
    public void setFirstName(String firstname)
    {
        this.firstname = firstname;
    }
    
    public String getLastName()
    {
        return lastname;
    }
    
    public void setLastName(String lastname)
    {
        this.lastname = lastname;
    }
    
    public String getPhoneNumber()
    {
        return phonenumber;
    }
    
    public void setPhoneNumber(String phonenumber)
    {
        this.phonenumber = phonenumber;
    }
    
    
    public int getId()
    {
        return id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public int getNumberofOrder() {
        return orderArray1.size();
    }

    public String getOrderAt(int index) {
        if (orderArray1.get(index) != null) 
        {
            return orderArray1.get(index).toString();
        } 
        else {
            return "";
        }
    }
    
    public void addOrder(Order ord) {
        orderArray1.add( ord);
        numberOfOrders++;
    }

    public void DelOrderAt(int index) {
        orderArray1.remove(index);
        numberOfOrders--;
    }
    
    public String toString()
    {
        String cst = " First Name: "+firstname+"\n"+" Last Name: "+lastname+"\n"+" Phone Number: "+phonenumber+"\n"
                +" Total Orders: "+getNumberofOrder()+"\n"+"\n";
        for (int i = 0; i < getNumberofOrder(); i++){
            cst += getOrderAt(i);
            for (int j = 0; j < orderArray1.get(i).getNumberofOrderItems(); j++){
                cst += orderArray1.get(i).getOrderItemAt(j)+"\n";
            }}
        return cst;
    }
    
}
