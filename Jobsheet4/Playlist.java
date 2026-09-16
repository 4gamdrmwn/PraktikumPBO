import java.util.ArrayList;

public class Playlist {
    private String idPlaylist;
    private String namaPlaylist;
    private Pengguna pembuat;
    private ArrayList<Lagu> daftarLagu;

    public Playlist(String idPlaylist, String namaPlaylist, Pengguna pembuat) {
        this.idPlaylist = idPlaylist;
        this.namaPlaylist = namaPlaylist;
        this.pembuat = pembuat;
        this.daftarLagu = new ArrayList<>();
    }

    public void tambahLagu(Lagu lagu) {
        daftarLagu.add(lagu);
    }

    public ArrayList<Lagu> getDaftarLagu() {
        return daftarLagu;
    }

    public int hitungTotalDurasi() {
        int total = 0;
        for (Lagu lagu : daftarLagu) {
            total += lagu.getDurasiDetik();
        }
        return total;
    }

    public String getInfo() {
        String info = "";
        info += "ID Playlist  : " + idPlaylist + "\n";
        info += "Nama Playlist: " + namaPlaylist + "\n";
        info += "Pembuat      : " + pembuat.getInfo() + "\n";
        info += "Total Durasi : " + hitungTotalDurasi() + " detik\n";
        
        if (!daftarLagu.isEmpty()) {
            info += "Daftar Lagu  :\n";
            for (int i = 0; i < daftarLagu.size(); i++) {
                info += "\t" + (i + 1) + ". " + daftarLagu.get(i).getInfo() + "\n";
            }
        } else {
            info += "Belum ada lagu di dalam playlist ini.\n";
        }
        return info;
    }
}