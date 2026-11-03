package Jobsheet9;

public class RobotPet extends VirtualPet {
    private int battery;
    
    public RobotPet(String name, int level, int battery) {
        super(name, level);
        this.battery = battery;
    }
    
    public void charge() {
        battery = 100;
        System.out.println(name + " berhasil di-charge. Baterai: " + battery + "%");
    }
}