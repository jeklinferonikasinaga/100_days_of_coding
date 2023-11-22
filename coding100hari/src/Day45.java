import java.util.Random;
import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int angka_rahasia = r.nextInt(100);
        while (true){
            System.out.println("masukkan tebakan angka anda :");
            int angka_tebakan = sc.nextInt();
            if (angka_tebakan == angka_rahasia) {
                System.out.println("tebakan anda benar");
                break;

            } else if (angka_tebakan < angka_rahasia) {
                System.out.println("tebakan anda terlalu kecil");

            } else if (angka_tebakan >angka_rahasia) {
                System.out.println("tebakan anda terlalu besar");

            }

        }

    }
}
