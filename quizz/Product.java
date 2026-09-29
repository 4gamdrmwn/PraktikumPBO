public class Product {
    private int productId;
    private double productPrice;
    private String productType;

    public Product(int productId, double productPrice, String productType) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    // Getter dan Setter
    public int getProductId() { 
        return productId; 
    }
    
    public void setProductId(int productId) { 
        this.productId = productId; 
    }

    public double getProductPrice() { 
        return productPrice; 
    }
    
    public void setProductPrice(double productPrice) { 
        this.productPrice = productPrice; 
    }

    public String getProductType() { 
        return productType; 
    }
    
    public void setProductType(String productType) { 
        this.productType = productType; 
    }

    // Method sesuai class diagram
    public void addProduct() {
        System.out.println("[Product] Produk ID " + productId + " (" + productType + ") berhasil didaftarkan ke sistem.");
    }

    public void modifyProduct() {
        System.out.println("[Product] Data produk ID " + productId + " berhasil diubah.");
    }

    public Product selectProduct(int productId) {
        if (this.productId == productId) {
            return this;
        }
        return null;
    }
}