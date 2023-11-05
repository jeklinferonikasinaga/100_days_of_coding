import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah_pola;
        System.out.println("masukkan jumlah pola :");
        jumlah_pola = sc.nextInt();
        for (int i = 0; i < jumlah_pola; i++) {
            System.out.print(" *");

        }
        System.out.println();

    }
}
