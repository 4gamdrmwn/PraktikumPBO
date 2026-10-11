public class Processor extends KomponenPC {
    public int jumlahCore;
    public int frequency;

    public Processor(String nama, String merk, int jumlahCore, int frequency) {
        super(nama, merk);
        this.jumlahCore = jumlahCore;
        this.frequency = frequency;
    }

    @Override
    public void cekStatus() {
        System.out.println("\n[SYSTEM CHECK] Mengecek Processor " + merk + " " + nama + "...");
        System.out.println("-> Seluruh " + jumlahCore + " Core terdeteksi bekerja aktif.");
        System.out.println("-> Boost Frequency mencapai " + frequency + " MHz dengan stabil.");
    }
}