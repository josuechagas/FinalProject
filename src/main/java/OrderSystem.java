public class OrderSystem {
    public static void main(String[] args)
    {
        CustomerArray carr = new CustomerArray();
        ProductArray parr = new ProductArray();
        OrderArray oarr = new OrderArray();
        OrderItemArray oIarr = new OrderItemArray();
        
        Customer JD = new Customer("John", "Deere", "620-776-9090", 1);
        carr.add(JD);
        Customer GD = new Customer("Garret", "Durr", "662-709-6075", 2);
        carr.add(GD);
        Customer PP = new Customer("Pedro", "Pinho", "379-555-8884", 3);
        carr.add(PP);
        
        Product JavaBook = new Product(1, "Java Book", 44, 126.00);
        parr.add(JavaBook);
        Product Laptop = new Product(2, "Laptop", 350, 670.00);
        parr.add(Laptop);
        Product SSD = new Product(3, "SSD", 85, 70.00);
        parr.add(SSD);
        Product Phone = new Product(4, "Phone", 534, 300.00);
        parr.add(Phone);
        Product Pencil = new Product(5, "Pencil", 700, 1.00);
        parr.add(Pencil);
        Product Notebook = new Product(6, "Notebook", 800, 3.00);
        parr.add(Notebook);
        
        
        OrderItem JavaBookItem1 = new OrderItem(1, 1, JavaBook.getProductId(), 2, JavaBook.getPrice(), JavaBook.getDescription());
        oIarr.add(JavaBookItem1);
        OrderItem LaptopItem1 = new OrderItem(1, 2, Laptop.getProductId(), 5, Laptop.getPrice(), Laptop.getDescription());
        oIarr.add(LaptopItem1);
       
        OrderItem JavaBookItem2 = new OrderItem(2, 1, JavaBook.getProductId(), 1, JavaBook.getPrice(), JavaBook.getDescription());
        oIarr.add(JavaBookItem2);
        OrderItem LaptopItem2 = new OrderItem(2, 2, Laptop.getProductId(), 4, Laptop.getPrice(), Laptop.getDescription());
        oIarr.add(LaptopItem2);
        
        OrderItem JavaBookItem3 = new OrderItem(3, 1, JavaBook.getProductId(), 3, JavaBook.getPrice(), JavaBook.getDescription());
        oIarr.add(JavaBookItem3);
        OrderItem LaptopItem3 = new OrderItem(3, 2, Laptop.getProductId(), 7, Laptop.getPrice(), Laptop.getDescription());
        oIarr.add(LaptopItem3);
        
        Order JDOrder1 = new Order(1, 1, "5-1-2020");
        JDOrder1.addOrderItem(JDOrder1.getOrderNumber(), 1, JavaBook.productId, 3, JavaBook.price, JavaBook.description);
        JDOrder1.addOrderItem(JDOrder1.getOrderNumber(), 2, SSD.productId, 4, SSD.price, SSD.description);
        Order JDOrder2 = new Order(2, 1, "5-9-2020");
        JDOrder2.addOrderItem(JDOrder2.getOrderNumber(), 0, Laptop.productId, 7, Laptop.price, Laptop.description);
        oarr.add(JDOrder1);
        oarr.add(JDOrder2);
        
        Order GDOrder1 = new Order(1, 2, "5-7-2020");
        GDOrder1.addOrderItem(GDOrder1.getOrderNumber(), 1, Phone.productId, 5, Phone.price, Phone.description);
        oarr.add(GDOrder1);
        Order GDOrder2 = new Order(2, 2, "5-26-2020");
        GDOrder2.addOrderItem(GDOrder2.getOrderNumber(), 1, JavaBook.productId, 9, JavaBook.price, JavaBook.description);
        oarr.add(GDOrder2);
        
        Order PPOrder1 = new Order(1, 3, "5-8-2020");
        PPOrder1.addOrderItem(PPOrder1.getOrderNumber(), 1, Laptop.productId, 12, Laptop.price, Laptop.description);
        oarr.add(PPOrder1);
        Order PPOrder2 = new Order(2, 3, "5-12-2020");
        PPOrder2.addOrderItem(PPOrder2.getOrderNumber(), 1, JavaBook.productId, 7, JavaBook.price, JavaBook.description);
        oarr.add(PPOrder2);
        Order PPOrder3 = new Order(3, 3, "5-15-2020");
        PPOrder3.addOrderItem(PPOrder3.getOrderNumber(), 1, SSD.productId, 10, SSD.price, SSD.description);
        oarr.add(PPOrder3);
        Order PPOrder4 = new Order(4, 3, "5-27-2020");
        PPOrder4.addOrderItem(PPOrder4.getOrderNumber(), 1, Phone.productId, 2, Phone.price, Phone.description);
        oarr.add(PPOrder4);
        
        JD.addOrder(JDOrder1);
        JD.addOrder(JDOrder2);
        
        GD.addOrder(GDOrder1);
        GD.addOrder(GDOrder2);
        
        PP.addOrder(PPOrder1);
        PP.addOrder(PPOrder2);
        PP.addOrder(PPOrder3);
        PP.addOrder(PPOrder4);
        
        for (int i = 0; i < carr.size(); i++)
        {
            System.out.printf("Customer ID %d: %n", i+1);
            System.out.println(carr.get(i));
            System.out.println("------------------------------------------------");       
        }
    }
}