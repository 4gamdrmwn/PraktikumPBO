public class Stock {
    private int quantity;
    private int shopNo;
    private Product product; // Relasi agregasi 1 ke 1 terhadap Product

    public Stock(int quantity, int shopNo, Product product) {
        this.quantity = quantity;
        this.shopNo = shopNo;
        this.product = product;
    }

    // Getter dan Setter
    public int getQuantity() { 
        return quantity; 
    }
    
    public void setQuantity(int quantity) { 
        this.quantity = quantity; 
    }

    public int getShopNo() { 
        return shopNo; 
    }
    
    public void setShopNo(int shopNo) { 
        this.shopNo = shopNo; 
    }

    public Product getProduct() { 
        return product; 
    }
    
    public void setProduct(Product product) { 
        this.product = product; 
    }

    // Method sesuai class diagram
    public void addStock() {
        System.out.println("[Stock] Stok awal sebanyak " + quantity + " unit ditambahkan pada Toko #" + shopNo + ".");
    }

    public void modifyStock(int quantity) {
        this.quantity = quantity;
        System.out.println("[Stock] Stok produk ID " + product.getProductId() + " pada Toko #" + shopNo + " diubah menjadi: " + this.quantity + " unit.");
    }

    public void selectStockItem() {
        System.out.println("[Stock] Toko #" + shopNo + " | Produk ID: " + product.getProductId() + " (" + product.getProductType() + ") | Sisa Stok: " + quantity);
    }
}