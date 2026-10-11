public class KomponenPC {
    public String nama;
    public String merk;
    public int dayaWatt;
    public double harga;

    // cons wo parameter
    public KomponenPC() {
        System.out.println("Komponen baru didaftarkan.");
    }

    // cons w parameter
    public KomponenPC(String nama, String merk) {
        this.nama = nama;
        this.merk = merk;
    }


    // overload method : normal price
    public void setHarga(double hargaBaru) {
        this.harga = hargaBaru;
        System.out.println("Harga " + this.nama + " diatur ke: Rp." + this.harga);
    }

    // discount price
    public void setHarga(double hargaBaru, double diskonPersen) {
        double potongan = hargaBaru * (diskonPersen / 100);
        this.harga = hargaBaru - potongan;
        System.out.println("Harga " + this.nama + " setelah diskon " + diskonPersen + "% adalah: Rp." + this.harga);
    }

    // standard method
    public void cekStatus() {
        System.out.println("Mengecek status komponen umum...");
    }
}