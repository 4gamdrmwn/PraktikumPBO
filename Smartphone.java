public class Smartphone {
    public String brand;
    public String type;
    public int volume;
    public String color;

    public void turnOn() {
        System.out.println(brand + " " + type + " is ON");
    }

    public void turnOff() {
        System.out.println(brand + " " + type + " is OFF");
    }

    public void charge() {
        System.out.println("Charging phone...");
    }

    public void increaseVolume() {
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void decreaseVolume() {
        volume--;
        System.out.println("Volume: " + volume);
    }
}