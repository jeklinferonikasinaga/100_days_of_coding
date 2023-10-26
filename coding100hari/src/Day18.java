import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah;
        System.out.println("masukkan jumlah sisi :");
        jumlah = sc.nextInt();
        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < jumlah-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
