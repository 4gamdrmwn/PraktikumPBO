package Jobsheet9;

public class Dragon extends MythicalPet {
    private String fireColor;
    
    public Dragon(String name, int level, int hunger, int energy, String fireColor) {
        super(name, level, hunger, energy);
        this.fireColor = fireColor;
    }
    
    @Override
    public void play() {
        energy = Math.max(energy - 30, 0);
        System.out.println(name + " terbang menyemburkan api berwarna " + fireColor + "! Sisa energi: " + energy);
    }
}