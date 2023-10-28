import java.util.Scanner;

public class Day19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        System.out.println("masukkan angka :");
        angka = sc.nextInt();
        for (int i = 0; i < angka; i++) {
            if (i > 0 && i < 10) {
                System.out.println(i + " angka adalah satuan");
            } else if (i >= 10 && i<= 99) {
                System.out.println(i+ "angka adalah puluhan ");

            } else if (i >= 100 && i < 1000) {
                System.out.println(i + " angka adalah ratusan ");

            } else if (i >= 1000 && i < 10000) {
                System.out.println(i + "angka adalah ribuan ");

            }
        }


    }
}
