package midexam;

public class KomponenPC {
    private String nama;
    private String merk;
    private int dayaWatt;

    public KomponenPC(String nama, String merk, int dayaWatt) {
        this.nama = nama;
        this.merk = merk;
        this.dayaWatt = dayaWatt;
    }

    public void displayInfo() {
        System.out.println("Component Name : " + nama);
        System.out.println("Brand          : " + merk);
        System.out.println("Power (TDP)    : " + dayaWatt + " Watt");
    }
}