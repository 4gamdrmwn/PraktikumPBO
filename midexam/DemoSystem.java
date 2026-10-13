package midexam;

public class DemoSystem {
    public static void main(String[] args) {
        System.out.println("===== User System Demo =====");

        System.out.println("=== Customer Actions ===");
        Customer cust = new Customer();
        cust.log_in(101, 12345);
        System.out.println("Verification Status: " + cust.get_verification_status());
        cust.apply_verification("KTP_Document.png");
        cust.log_out();

        System.out.println("=== Admin Actions ===");
        Admin admin = new Admin();
        admin.log_in(999, 54321);
        admin.verify_user();
        admin.Retrieve_complain(); 
        Vehicle newCar = admin.add_vehicle();
        admin.log_out();
    }
}