public class Pengguna {
    private String idUser;
    private String username;
    private String email;

    public Pengguna(String idUser, String username, String email) {
        this.idUser = idUser;
        this.username = username;
        this.email = email;
    }

    public String getIdUser() {
        return idUser;
    }

    public String getUsername() {
        return username;
    }

    public String getInfo() {
        return username + " (" + email + ")";
    }
}