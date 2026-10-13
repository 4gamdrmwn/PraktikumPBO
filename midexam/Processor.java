package midexam;

public class Processor extends KomponenPC {
    private int jumlahCore;
    private String socket;
    private int frequency;
    private int threads;

    public Processor(String nama, String merk, int dayaWatt, int jumlahCore, String socket, int frequency, int threads) {
        super(nama, merk, dayaWatt);
        this.jumlahCore = jumlahCore;
        this.socket = socket;
        this.frequency = frequency;
        this.threads = threads;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Socket         : " + socket);
        System.out.println("Cores/Threads  : " + jumlahCore + "C / " + threads + "T");
        System.out.println("Base Freq      : " + frequency + " MHz");
    }
}