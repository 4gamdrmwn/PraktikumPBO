public class Lagu {
    private String idLagu;
    private String judul;
    private String artis;
    private int durasiDetik;

    public Lagu(String idLagu, String judul, String artis, int durasiDetik) {
        this.idLagu = idLagu;
        this.judul = judul;
        this.artis = artis;
        this.durasiDetik = durasiDetik;
    }

    public String getIdLagu() {
        return idLagu;
    }

    public String getJudul() {
        return judul;
    }

    public int getDurasiDetik() {
        return durasiDetik;
    }

    public String getInfo() {
        return judul + " - " + artis + " [" + durasiDetik + " detik]";
    }
}