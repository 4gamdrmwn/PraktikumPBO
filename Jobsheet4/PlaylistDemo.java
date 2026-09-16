public class PlaylistDemo {
    public static void main(String[] args) {
        Pengguna user1 = new Pengguna("USR01", "agamyoga", "agam@example.com");

        Playlist playlist1 = new Playlist("PL01", "Coding Chill", user1);

        Lagu lagu1 = new Lagu("L01", "Midnight City", "M83", 243);
        Lagu lagu2 = new Lagu("L02", "Resonance", "HOME", 212);
        Lagu lagu3 = new Lagu("L03", "After Dark", "Mr.Kitty", 259);

        playlist1.tambahLagu(lagu1);
        playlist1.tambahLagu(lagu2);
        playlist1.tambahLagu(lagu3);

        System.out.println(playlist1.getInfo());

        Playlist playlist2 = new Playlist("PL02", "Fokus Belajar", user1);
        System.out.println(playlist2.getInfo());
    }
}