package Jobsheet9;

public class Cat extends VirtualPet implements Feedable {
    private int hunger;
    private int energy;
    
    public Cat(String name, int level, int hunger, int energy) {
        super(name, level);
        this.hunger = hunger;
        this.energy = energy;
    }
    
    @Override
    public void feed(String food) {
        hunger = Math.min(hunger + 20, MAX_HUNGER);
        System.out.println(name + " makan " + food + ". Rasa lapar terisi menjadi: " + hunger);
    }
    
    @Override
    public void play() {
        energy = Math.max(energy - 15, 0);
        System.out.println(name + " bermain. Sisa energi: " + energy);
    }
    
    @Override
    public void sleep() {
        energy = MAX_ENERGY;
        System.out.println(name + " tidur. Energi penuh: " + energy);
    }
}