import java.util.Scanner;

public class Day15 {

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);

            System.out.print("Masukkan angka mulai: ");
            int mulai = sc.nextInt();

            System.out.print("Masukkan angka selesai: ");
            int selesai = sc.nextInt();

            if (mulai < 1 || selesai > 100) {
                System.out.println("Masukkan angka antara 1 dan 100.");
            } else if (mulai > selesai) {
                System.out.println("Angka mulai harus lebih kecil dari angka selesai.");
            } else {
                for (int i = mulai; i <= selesai; i++) {
                    System.out.println(i);
                }
            }
        }
    }


