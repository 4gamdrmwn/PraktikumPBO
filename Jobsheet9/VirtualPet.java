package Jobsheet9;

public abstract class VirtualPet {
    protected String name;
    protected int level;
    
    public VirtualPet(String name, int level) {
        this.name = name;
        this.level = level;
    }
    
    public void showStatus() {
        System.out.println("Nama: " + name + " | Level: " + level);
    }
}