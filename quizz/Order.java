import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private double amount;
    private String orderDate;
    private Customer customer;        // relasi asosiasi (1 customer)
    private List<Product> productList; // relasi agregasi (1..* product)

    public Order(int orderId, String orderDate, Customer customer) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.customer = customer;
        this.productList = new ArrayList<>();
        this.amount = 0.0;
    }

    // Getter dan Setter
    public int getOrderId() { 
        return orderId; 
    }
    
    public void setOrderId(int orderId) { 
        this.orderId = orderId; 
    }

    public double getAmount() { 
        return amount; 
    }
    
    public void setAmount(double amount) { 
        this.amount = amount; 
    }

    public String getOrderDate() { 
        return orderDate; 
    }
    
    public void setOrderDate(String orderDate) { 
        this.orderDate = orderDate; 
    }

    public Customer getCustomer() { 
        return customer; 
    }
    
    public void setCustomer(Customer customer) { 
        this.customer = customer; 
    }

    public List<Product> getProductList() { 
        return productList; 
    }

    public void createOrder() {
        System.out.println("[Order] Pesanan ORD-" + orderId + " dibuat pada tanggal " + orderDate + " untuk " + customer.getCustomerName() + ".");
    }

    public void editOrder(int orderId) {
        this.orderId = orderId;
        System.out.println("[Order] ID Pesanan berhasil diperbarui menjadi ORD-" + this.orderId + ".");
    }

    public void addProduct(Product p) {
        productList.add(p);
        this.amount += p.getProductPrice();
        System.out.println("[Order] Produk ID " + p.getProductId() + " (" + p.getProductType() + ") ditambahkan. Harga: Rp" + p.getProductPrice());
    }

    public void displayOrderSummary() {
        System.out.println("\n========================================================");
        System.out.println("                 DETAIL TRANSAKSI ORDER                 ");
        System.out.println("========================================================");
        System.out.println("Nomor Order     : ORD-" + orderId);
        System.out.println("Tanggal Order   : " + orderDate);
        System.out.println("ID Pelanggan    : " + customer.getCustomerId());
        System.out.println("Nama Pelanggan  : " + customer.getCustomerName());
        System.out.println("Alamat          : " + customer.getAddress());
        System.out.println("Nomor Telepon   : " + customer.getPhone());
        System.out.println("--------------------------------------------------------");
        System.out.println("Daftar Barang yang Dipesan:");
        for (int i = 0; i < productList.size(); i++) {
            Product p = productList.get(i);
            System.out.println("  " + (i + 1) + ". Produk ID: " + p.getProductId() + " [" + p.getProductType() + "] - Rp" + p.getProductPrice());
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("TOTAL PEMBAYARAN: Rp" + amount);
        System.out.println("========================================================\n");
    }
}