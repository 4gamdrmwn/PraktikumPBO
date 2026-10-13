package midexam;

public class User {
    protected UserProfile profile;

    public User() {
        this.profile = new UserProfile();
    }

    public void log_in(int user_id, int password) {
        System.out.println("[SYSTEM] User " + user_id + " successfully logged in.");
    }
    
    public void recover_password() {
        System.out.println("[SYSTEM] Initiating password recovery process...");
    }
    
    public void log_out() {
        System.out.println("[SYSTEM] User has logged out.");
    }
}