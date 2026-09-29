public class MainOrder {
    public static void main(String[] args) {
        System.out.println(">>> 1. Inisialisasi dan Penambahan Pelanggan <<<");
        Customer customer1 = new Customer(101, "Agam Darmawan", "Pakisjajar Permai Blok D No 9, Malang", "08123456789");
        customer1.addCustomer();

        System.out.println("\n>>> 2. Inisialisasi Produk dan Pengaturan Stok <<<");
        Product product1 = new Product(1001, 8500000.0, "Laptop Gaming");
        Product product2 = new Product(1002, 350000.0, "Mechanical Keyboard");
        product1.addProduct();
        product2.addProduct();

        Stock stock1 = new Stock(15, 1, product1);
        Stock stock2 = new Stock(30, 1, product2);
        stock1.addStock();
        stock2.addStock();

        // modify and display stok produk
        stock1.modifyStock(12);
        stock1.selectStockItem();
        stock2.selectStockItem();

        System.out.println("\n>>> 3. Pembuatan Order dan Agregasi Produk <<<");
        Order order1 = new Order(501, "2026-09-22", customer1);
        order1.createOrder();
        order1.addProduct(product1);
        order1.addProduct(product2);

        // print order summary
        order1.displayOrderSummary();
    }
}