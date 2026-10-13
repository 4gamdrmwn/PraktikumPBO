package midexam;

public class DemoMultilevel {
    public static void main(String[] args) {
        System.out.println("=== Processor Gaming Demo ===");

        ProcessorGaming cpuGamer = new ProcessorGaming(
            "Core i9-13900K", "Intel", 253, 
            24, "LGA 1700", 3000, 32, 
            true, 5800
        );

        cpuGamer.displayInfo();
        
        System.out.println("================================");
        
        cpuGamer.overclock();
    }
}