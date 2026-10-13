package midexam;

public class Admin extends User {
    
    public void update_vehicle_details(int vehicle_id) {
        System.out.println("Admin updated details for vehicle ID: " + vehicle_id);
    }
    
    public Vehicle add_vehicle() {
        System.out.println("Admin is adding a new vehicle to the database...");
        return new Vehicle();
    }
    
    public void Retrieve_complain() {
        System.out.println("Admin retrieved the latest customer complaints.");
    }
    
    public void verify_user() {
        System.out.println("Admin verified a customer's submitted documents. Status is now TRUE.");
    }
}