package bengkel;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class ServiceTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private Service service;
    private Employee employee;

    public ServiceTransaction(Customer customer, Vehicle vehicle, Service service, Employee employee) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.service = service;
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    // biaya tambahan berdasarkan jenis kendaraan
    public double getServiceFee() {
        if (vehicle.getVehicleType().equalsIgnoreCase("Car")) {
            return 50000.0;
        } else if (vehicle.getVehicleType().equalsIgnoreCase("Motorcycle")) {
            return 20000.0;
        }
        return 0.0;
    }

    // total estimasi biaya
    public double calculateTotalCost() {
        return service.getServicePrice() + getServiceFee();
    }

    public void printTransactionDetail() {
        DecimalFormat kursIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndo.setDecimalFormatSymbols(formatRp);

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Nama Pelanggan  : " + customer.getName() + " (No. Telp: " + customer.getPhoneNumber() + ")");
        System.out.println("Kendaraan       : " + vehicle.getBrand() + " " + vehicle.getModel() + " [" + vehicle.getVehicleType() + "]");
        System.out.println("Nomor Polisi    : " + vehicle.getPlateNumber());
        System.out.println("Teknisi / Staf  : " + employee.getEmployeeName() + " (" + employee.getRole() + ")");
        System.out.println("Layanan Servis  : " + service.getServiceName());
        System.out.println("Biaya Servis    : " + kursIndo.format(service.getServicePrice()));
        System.out.println("Biaya Tambahan  : " + kursIndo.format(getServiceFee()) + " (" + vehicle.getVehicleType() + ")");
        System.out.println("TOTAL ESTIMASI  : " + kursIndo.format(calculateTotalCost()));
    }
}