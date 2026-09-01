package Jobsheet2;
public class MahasiswaDemo {
    public static void main(String[] args) {
        // Object 1
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "254107060108";
        m1.nama = "Agam Yoga Darmawan";
        m1.alamat = "Malang, Jawa Timur";
        m1.kelas = "SIB-2G";
        m1.displayBiodata();

        System.out.println("---------------------------");

        // Object 2 (Step 12)
        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "254107060109";
        m2.nama = "Muhammad Iam Nugroho";
        m2.alamat = "Batu, Jawa Timur";
        m2.kelas = "SIB-2G";
        m2.displayBiodata();
    }
}