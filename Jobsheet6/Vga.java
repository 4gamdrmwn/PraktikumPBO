public class Vga extends KomponenPC {
    public int vramCapacity;
    public int streamProcessor;
    public int rayAccelerators;

    // cons dengan parameter
    public Vga(String nama, String merk, int dayaWatt, int vramCapacity, int streamProcessor, int rayAccelerators) {
        // calling constructor dari parent class
        super(nama, merk, dayaWatt);
        this.vramCapacity = vramCapacity;
        this.streamProcessor = streamProcessor;
        this.rayAccelerators = rayAccelerators;
    }

    // print info vga
    public void printInfoVga() {
        printInfo(); 
        
        // print vga spec
        System.out.println("Kapasitas VRAM: " + vramCapacity + " GB");
        System.out.println("Stream Proc.  : " + streamProcessor);
        System.out.println("Ray Accel.    : " + rayAccelerators);
    }
}