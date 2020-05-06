import java.util.ArrayList;

public class CustomerArray extends ArrayList{
    
    static ArrayList<Customer> customers ;
    
    public static void createCustomer(Customer cust) {
        customers.add(cust);
    }
    
    public static String getAllCustomers() {
        String cus = "";
        for (int i = 0; i < customers.size(); i++) {
            cus += customers.get(i)+"\n";
        }
        return cus;
    }
}
