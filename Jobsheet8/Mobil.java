package Jobsheet8;

public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merek, String model, int tahunProduksi, int jumlahPintu) {
        super(merek, model, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Mobil " + this.model + ": Menginjak pedal rem dan menekan tombol Start Engine.");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Pintu   : " + this.jumlahPintu);
    }
}