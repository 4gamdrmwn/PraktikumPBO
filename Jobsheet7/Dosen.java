public class Dosen extends Manusia {
    // --- OVERRIDING ---
    @Override
    public void makan() {
        System.out.println("Dosen sedang makan di sela-sela jadwal mengajar.");
    }

    public void lembur() {
        System.out.println("Dosen lembur mengoreksi tugas mahasiswa.");
    }
}