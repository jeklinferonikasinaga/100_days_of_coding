package aritmatika;

import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan lebar :");
        double lebar;
        lebar = sc.nextDouble();
        System.out.println("masukkan panjang :");
        double panjang;
        panjang = sc.nextDouble();
        double harga_tanah_permeter = 500000;

        System.out.println(panjang*lebar*harga_tanah_permeter);
    }
}
