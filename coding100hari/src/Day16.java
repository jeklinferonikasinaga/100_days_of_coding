import java.util.Scanner;

public class Day16 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Masukkan nama depan: ");
            String namaDepan = sc.nextLine();

            System.out.print("Masukkan nama belakang: ");
            String namaBelakang = sc.nextLine();

            String namaLengkap = namaDepan + " " + namaBelakang;
            System.out.println("Nama lengkap: " + namaLengkap);



    }

}
