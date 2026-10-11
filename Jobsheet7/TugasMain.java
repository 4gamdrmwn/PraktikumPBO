public class TugasMain {
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN OVERLOADING (Segitiga) ===");
        Segitiga sgt = new Segitiga();
        
        System.out.println("Total sudut (1 sudut: 90)    : " + sgt.totalSudut(90));
        System.out.println("Total sudut (2 sudut: 60, 60): " + sgt.totalSudut(60, 60));
        System.out.println("Keliling (3 sisi: 10, 15, 20): " + sgt.keliling(10, 15, 20));
        System.out.println("Keliling (2 sisi phytagoras 3 & 4) : " + sgt.keliling(3, 4));


        System.out.println("\n=== PENGUJIAN OVERRIDING & DYNAMIC DISPATCH ===");
        
        Manusia manusiaUmum = new Manusia();
        System.out.println("-- Final Method --");
        manusiaUmum.bernafas();

        System.out.println("\n-- Dynamic Method Dispatch --");
        Manusia person1 = new Dosen();
        Manusia person2 = new Mahasiswa();

        person1.makan(); // Output: Dosen sedang makan...
        person2.makan(); // Output: Mahasiswa sedang makan...
    }
}