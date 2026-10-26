package Jobsheet8;

public class Main {
    public static void main(String[] args) {
        // instansiasi objek subclass Mobil
        Mobil mobil1 = new Mobil("Toyota", "GR Yaris", 2023, 3);
        System.out.println("=== DATA MOBIL ===");
        mobil1.cetakInfo();
        mobil1.nyalakanMesin();

        System.out.println();

        // instansiasi objek subclass Motor
        Motor motor1 = new Motor("Honda", "Vario 125", 2022, "Otomatis");
        System.out.println("=== DATA MOTOR ===");
        motor1.cetakInfo();
        motor1.nyalakanMesin();
    }
}