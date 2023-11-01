import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double panjang;
        double lebar;
        System.out.println("masukkan panjang :");
        panjang = sc.nextDouble();
        System.out.println("masukkan lebar :");
        lebar = sc.nextDouble();
        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < lebar; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
