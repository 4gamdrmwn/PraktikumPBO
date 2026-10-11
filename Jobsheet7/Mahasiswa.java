public class Mahasiswa extends Manusia {
    // --- OVERRIDING ---
    @Override
    public void makan() {
        System.out.println("Mahasiswa sedang makan di kantin kampus.");
    }

    public void tidur() {
        System.out.println("Mahasiswa tidur setelah begadang mengerjakan tugas.");
    }
}