package Jobsheet9;

public interface Feedable {
    int MAX_HUNGER = 100;
    int MAX_ENERGY = 100;
    
    void feed(String food);
    void play();
    void sleep();
}