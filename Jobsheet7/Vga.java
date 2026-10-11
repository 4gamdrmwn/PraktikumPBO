public class Vga extends KomponenPC {
    public int vramCapacity;
    public int streamProcessor;

    public Vga(String nama, String merk, int vramCapacity, int streamProcessor) {
        super(nama, merk); 
        this.vramCapacity = vramCapacity;
        this.streamProcessor = streamProcessor;
    }

    @Override
    public void cekStatus() {
        System.out.println("\n[SYSTEM CHECK] Mengecek VGA " + merk + " " + nama + "...");
        System.out.println("-> Kapasitas VRAM (" + vramCapacity + "GB) terbaca normal.");
        System.out.println("-> Suhu Core & Putaran Kipas stabil.");
    }
}