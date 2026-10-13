package midexam;

public class ProcessorGaming extends Processor {
    private boolean isUnlocked; 
    private int boostClock;

    public ProcessorGaming(String nama, String merk, int dayaWatt, int jumlahCore, String socket, int frequency, int threads, boolean isUnlocked, int boostClock) {
        super(nama, merk, dayaWatt, jumlahCore, socket, frequency, threads);
        this.isUnlocked = isUnlocked;
        this.boostClock = boostClock;
    }

    public void overclock() {
        if (isUnlocked) {
            System.out.println("[SYSTEM] Overclocking activated! Frequency boosted to " + boostClock + " MHz.");
        } else {
            System.out.println("[SYSTEM] Failed! This processor is factory-locked.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Unlocked (OC)  : " + (isUnlocked ? "Yes" : "No"));
        System.out.println("Boost Freq     : " + boostClock + " MHz");
    }
}