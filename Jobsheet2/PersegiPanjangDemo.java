package Jobsheet2;

public class PersegiPanjangDemo {
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 10;
        pp1.lebar = 5;

        pp1.displayInfo();
        System.out.println("Luas Keliling : " + pp1.getKeliling());
        System.out.println("Luas Persegi  : " + pp1.getLuas());
    }
}