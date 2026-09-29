public class Customer {
    private int customerId;
    private String customerName;
    private String address;
    private String phone;

    public Customer(int customerId, String customerName, String address, String phone) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
    }

    // Getter dan Setter
    public int getCustomerId() { 
        return customerId; 
    }
    
    public void setCustomerId(int customerId) { 
        this.customerId = customerId; 
    }

    public String getCustomerName() { 
        return customerName; 
    }
    
    public void setCustomerName(String customerName) { 
        this.customerName = customerName; 
    }

    public String getAddress() { 
        return address; 
    }
    
    public void setAddress(String address) { 
        this.address = address; 
    }

    public String getPhone() { 
        return phone; 
    }
    
    public void setPhone(String phone) { 
        this.phone = phone; 
    }

    public void addCustomer() {
        System.out.println("[Customer] Data pelanggan '" + customerName + "' (ID: " + customerId + ") berhasil ditambahkan.");
    }

    public void editCustomer() {
        System.out.println("[Customer] Data pelanggan dengan ID " + customerId + " berhasil diperbarui.");
    }

    public void deleteCustomer() {
        System.out.println("[Customer] Data pelanggan dengan ID " + customerId + " telah dihapus.");
    }
}