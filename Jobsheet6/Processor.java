public class Processor extends KomponenPC {
    public int jumlahCore;
    public String socket;
    public int frequency;
    public int threads;

    // cons dengan parameter
    public Processor(String nama, String merk, int dayaWatt, int jumlahCore, String socket, int frequency, int threads) {
        // Memanggil constructor dari induk
        super(nama, merk, dayaWatt);
        this.jumlahCore = jumlahCore;
        this.socket = socket;
        this.frequency = frequency;
        this.threads = threads;
    }

    // print info processor
    public void printInfoProcessor() {
        printInfo(); 
        
        // print processor spec
        System.out.println("Socket        : " + socket);
        System.out.println("Jumlah Core   : " + jumlahCore + " Core / " + threads + " Threads");
        System.out.println("Base Freq.    : " + frequency + " MHz");
    }
}