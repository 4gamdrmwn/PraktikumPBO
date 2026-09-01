package Jobsheet2;
public class MahasiswaDemo {
    public static void main(String[] args) {
        // Object 1
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        m1.displayBiodata();

        System.out.println("---------------------------");

        // Object 2
        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "254107060109";
        m2.nama = "Muhammad Iam Nugroho";
        m2.alamat = "Batu, Jawa Timur";
        m2.kelas = "SIB-2G";
        m2.displayBiodata();

        System.out.println("---------------------------");
        // Object 3
        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "254107060108";
        m3.nama = "Agam Yoga Darmawan";
        m3.alamat = "Malang, Jawa Timur";
        m3.kelas = "SIB-2G";
        m3.displayBiodata();
    }
}