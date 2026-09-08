package Jobsheet3;

public class MotorDemo {
        public static void main(String[] args) {
            // Object 1
            Motor motor1 = new Motor();
            motor1.setPlatNomor("B 0838 XZ");
            motor1.setKecepatan(50);
            motor1.displayStatus();

            // Object 2
            Motor motor2 = new Motor();
            motor2.setPlatNomor("N 9840 AB");
            motor2.setIsMesinOn(true);
            motor2.setKecepatan(40);
            motor2.displayStatus();

            // Object 3
            Motor motor3 = new Motor();
            motor3.setPlatNomor("D 8343 CV");
            motor3.setKecepatan(60);
            motor3.displayStatus();

            // Object 4
            Motor motor4 = new Motor();
            motor4.setPlatNomor("B 1234 CD");
            motor4.setIsMesinOn(true);
            motor4.setKecepatan(120);
            motor4.displayStatus();
        }
    }
