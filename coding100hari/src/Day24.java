import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tinggi;
        System.out.println("masukkan tinggi :");
        tinggi = sc.nextDouble();
        for (int i = 0; i <= tinggi ; i++) {
            for (int j = 0; j <= tinggi-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
