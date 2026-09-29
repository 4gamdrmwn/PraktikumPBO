package bengkel;

public class MainBengkelMaju {
    public static void main(String[] args) {
        System.out.println("======================================================================");
        System.out.println("              SISTEM MANAJEMEN SERVIS BENGKEL MAJU                    ");
        System.out.println("======================================================================\n");

        // instansiasi employee
        Employee emp1 = new Employee("EMP001", "Bambang Sugiharto", "Mekanik Mobil");
        Employee emp2 = new Employee("EMP002", "Dedi Irawan", "Mekanik Motor");

        // instansiasi service
        Service tuneUpCar = new Service("Tune Up & Ganti Oli Mesin Mobil", 350000.0);
        Service brakeCar = new Service("Servis Sistem Pengereman Mobil", 200000.0);
        Service serviceMotor1 = new Service("Servis Ringan & Ganti Oli Motor", 95000.0);
        Service cvtMotor2 = new Service("Servis Lengkap & Pembersihan CVT", 150000.0);

        // Instansiasi Pelanggan (Customer)
        Customer cust1 = new Customer("Agam Yoga Darmawan", "08123456789");
        Customer cust2 = new Customer("Tesalonika Grace Benila", "08345678901");

        // Instansiasi kendaraaan
        Vehicle car1 = new Vehicle("N 1234 AB", "Toyota", "Toyota GR Yaris", "Car");
        Vehicle car2 = new Vehicle("G 8888 HON", "Honda", "Mitsubishi Lancer Evo X", "Car");
        Vehicle motor1 = new Vehicle("N 5678 CD", "Yamaha", "RX-King", "Motorcycle");
        Vehicle motor2 = new Vehicle("G 0831 EF", "Honda", "Vario 150", "Motorcycle");

        // menghubungkan kendaraan ke pelanggan
        cust1.addVehicle(car1);
        cust1.addVehicle(motor1);

        cust2.addVehicle(car2);
        cust2.addVehicle(motor2);

        // membuat transaksi
        ServiceTransaction trx1 = new ServiceTransaction(cust1, car1, tuneUpCar, emp1);
        ServiceTransaction trx2 = new ServiceTransaction(cust2, car2, brakeCar, emp1);
        ServiceTransaction trx3 = new ServiceTransaction(cust1, motor1, serviceMotor1, emp2);
        ServiceTransaction trx4 = new ServiceTransaction(cust2, motor2, cvtMotor2, emp2);

        // detail Transaksi
        trx1.printTransactionDetail();
        trx2.printTransactionDetail();
        trx3.printTransactionDetail();
        trx4.printTransactionDetail();

        System.out.println("----------------------------------------------------------------------");
        System.out.println("\nSemua data servis kendaraan berhasil diproses.");
    }
}