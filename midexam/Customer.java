package midexam;

public class Customer extends User {
    private boolean verification_status = false;

    public boolean get_verification_status() {
        return verification_status;
    }

    public void apply_verification(String doc) {
        System.out.println("Customer applied for verification using document: " + doc);
        System.out.println("Waiting for Admin approval...");
    }
}