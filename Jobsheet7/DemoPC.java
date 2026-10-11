public class DemoPC {
    public static void main(String[] args) {
        System.out.println("=== METHOD OVERLOADING ===");
        
        KomponenPC motherboard = new KomponenPC("B550M K", "Gigabyte");
        
        motherboard.setHarga(1500000);
        
        motherboard.setHarga(1500000, 10); // Diskon 10%


        System.out.println("\n=== METHOD OVERRIDING ===");
        
        // instansiasi Vga
        Vga gpu = new Vga("RX 6600 XT Nitro", "Sapphire", 8, 2048);
        gpu.cekStatus(); // Akan memanggil cekStatus khusus VGA

        // instansiasi Processor
        Processor cpu = new Processor("Ryzen 5 6600H", "AMD", 6, 4500);
        cpu.cekStatus(); // Akan memanggil cekStatus khusus CPU
    }
}