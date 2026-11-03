package Jobsheet9;

public abstract class MythicalPet extends VirtualPet implements Feedable {
    protected int hunger;
    protected int energy;
    
    public MythicalPet(String name, int level, int hunger, int energy) {
        super(name, level);
        this.hunger = hunger;
        this.energy = energy;
    }
    
    @Override
    public void feed(String food) {
        hunger = Math.min(hunger + 40, MAX_HUNGER);
        System.out.println(name + " melahap " + food + "! Lapar: " + hunger);
    }
    
    @Override
    public void sleep() {
        energy = MAX_ENERGY;
        System.out.println(name + " tertidur lelap memulihkan tenaga.");
    }
}