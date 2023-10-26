import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan panjang segitiga : ");
        int jumlah;
        jumlah = sc.nextInt();
        for (int i = 0; i <jumlah ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();


        }
    }
}
