package Jobsheet8;

public abstract class Kendaraan {
    protected String merek;
    protected String model;
    protected int tahunProduksi;

    public Kendaraan(String merek, String model, int tahunProduksi) {
        this.merek = merek;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    // abstract method
    public abstract void nyalakanMesin();

    // concrete method
    public void cetakInfo() {
        System.out.println("Merek          : " + this.merek);
        System.out.println("Model          : " + this.model);
        System.out.println("Tahun Produksi : " + this.tahunProduksi);
    }
}