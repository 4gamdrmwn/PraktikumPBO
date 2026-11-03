package Jobsheet9;

public class Main {
    public static void main(String[] args) {
        Kipas kipas = new Kipas("Berdiri", 250000, "Putih", "Maspion");
        TV tv = new TV("LED", 15, 3000000, "Hitam", "Samsung");
        SmartFridge kulkasPintar = new SmartFridge(20, 2, 8000000, "Silver", "LG");

        System.out.println(kipas.getInfo());
        
        System.out.println(tv.getInfo());
        tv.naikkanVolume(5);
        System.out.println("Setelah volume TV dinaikkan: " + tv.getInfo());
        
        System.out.println(kulkasPintar.getInfo());
        kulkasPintar.turunkanVolume(10);
        System.out.println("Setelah volume SmartFridge diturunkan: " + kulkasPintar.getInfo());
    }
}