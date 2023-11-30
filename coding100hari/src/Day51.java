import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Konfersi Panjang");
            System.out.println("1. CentiMeter \n2. Meter \n3. KiloMeter");
            System.out.println("masukkan pilihan :");
            int pilihan = sc.nextInt();
            if (pilihan == 1) {
                System.out.println("masukkan panjang centimeter :");
                double centimeter = sc.nextDouble();
                System.out.println("meter = " + centimeter / 100 + "m");
                System.out.println("kilimoter =" + centimeter / 100000 + "km");

            } else if (pilihan == 2) {
                System.out.println("masukkan panjang meter :");
                double meter = sc.nextDouble();
                System.out.println("centiMeter = " + meter * 100 + "cm");
                System.out.println("kilimoter =" + meter / 1000 + "km");

            } else if (pilihan == 3) {
                System.out.println("masukkan panjang kilometer :");
                double kiloMeter = sc.nextDouble();
                System.out.println("centiMeter = " + kiloMeter * 100000 + "cm");
                System.out.println("meter =" + kiloMeter * 1000 + "m");

            } else {
                System.out.println("pilihan tidak ada");
            }

        }
    }
}
