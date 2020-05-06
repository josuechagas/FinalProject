import java.util.ArrayList;

public class ProductArray extends ArrayList{
    
    static ArrayList<Product> products = new ArrayList<>();
    
    public static void createProduct(Product prod) {
        products.add(prod);
    }
    
    public static String getAllProducts() {
        String prd = "";
        for (int i = 0; i < products.size(); i++) {
            prd += products.get(i)+"\n";
        }
        return prd;
    }
}
