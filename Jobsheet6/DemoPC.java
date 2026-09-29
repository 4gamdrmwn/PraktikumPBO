public class DemoPC {
    public static void main(String[] args) {
        System.out.println("=== INSTANSIASI PROCESSOR ===");
        // create objek Processor
        Processor processorLama = new Processor("Ryzen 5 5600", "AMD", 65, 6, "AM4", 3700, 12);
        
        // print proc
        processorLama.printInfoProcessor();


        System.out.println("\n=== INSTANSIASI VGA ===");
        // create objek VGA
        Vga vgaLama = new Vga("RX 6600 XT", "Sapphire Nitro+", 120, 8, 128, 2);
        
        // print vga
        vgaLama.printInfoVga();
    }
}