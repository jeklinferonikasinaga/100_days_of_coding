import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int panjang ;
        int lebar;
        System.out.print("masukkan panjang : ");
        panjang = sc.nextInt();
        System.out.print("masukkan lebar : ");
        lebar = sc.nextInt();

        int hasil=panjang*lebar;
        System.out.println("luas persegi panjang itu adalah = "+hasil);

    }
}
