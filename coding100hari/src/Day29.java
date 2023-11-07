import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int panjang;
        int lebar;
        System.out.println("masukkan panjang pola :");
        panjang = sc.nextInt();
        System.out.println("masukkan lebar :  ");
        lebar = sc.nextInt();
        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j <lebar ; j++) {
                System.out.print(" *");

            }
            System.out.println();

        }
    }
}
