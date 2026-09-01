package Jobsheet2;
public class SmartphoneDemo {
    public static void main(String[] args) {
        // Object 1
        Smartphone hp1 = new Smartphone();
        hp1.brand = "Samsung";
        hp1.type = "S24";
        hp1.color = "Black";
        hp1.volume = 50;

        hp1.turnOn();
        hp1.increaseVolume();
        hp1.charge();
        hp1.turnOff();

        System.out.println();

        // Object 2
        Smartphone hp2 = new Smartphone();
        hp2.brand = "iPhone";
        hp2.type = "15";
        hp2.color = "White";
        hp2.volume = 30;

        hp2.turnOn();
        hp2.decreaseVolume();
        hp2.charge();
        hp2.turnOff();
    }
}