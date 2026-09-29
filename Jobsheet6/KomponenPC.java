public class KomponenPC {
    public String nama;
    public String merk;
    public int dayaWatt;

    // cons dengan parameter
    public KomponenPC(String nama, String merk, int dayaWatt) {
        this.nama = nama;
        this.merk = merk;
        this.dayaWatt = dayaWatt;
    }

    // real method punya parent class
    public void printInfo() {
        System.out.println("Nama Komponen : " + nama);
        System.out.println("Merk          : " + merk);
        System.out.println("Daya (TDP)    : " + dayaWatt + " Watt");
    }
}