package Jobsheet8;

public class Motor extends Kendaraan {
    private String jenisTransmisi;

    public Motor(String merek, String model, int tahunProduksi, String jenisTransmisi) {
        super(merek, model, tahunProduksi);
        this.jenisTransmisi = jenisTransmisi;
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Motor " + this.model + ": Menarik tuas rem lalu menekan tombol starter listrik.");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Transmisi      : " + this.jenisTransmisi);
    }
}