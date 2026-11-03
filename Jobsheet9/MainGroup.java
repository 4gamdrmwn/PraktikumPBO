package Jobsheet9;

public class MainGroup {
    public static void main(String[] args) {
        Cat kucing = new Cat("Milo", 5, 50, 80);
        kucing.showStatus();
        kucing.feed("Ikan");
        kucing.play();
        kucing.sleep();
        
        System.out.println("-------------------------");
        
        Dragon naga = new Dragon("Ignis", 50, 40, 90, "Biru");
        naga.showStatus();
        naga.feed("Daging Bakar");
        naga.play(); // Mengambil dragon
        naga.sleep(); // Mengambil abstract mythicalpet
        
        System.out.println("-------------------------");
        
        RobotPet robot = new RobotPet("Astro", 10, 20);
        robot.showStatus();
        robot.charge();
    }
}