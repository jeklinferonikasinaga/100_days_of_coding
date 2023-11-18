package Perbandingan;

import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gajiBulanan = 5000000;

        System.out.println("masukkan jumlah tidak hadir :");
        int jumlah_tidak_hadir = sc.nextInt();


        if(jumlah_tidak_hadir > 3) {
            double potongan = 25000 * jumlah_tidak_hadir;
            double gaji_potongan = gajiBulanan - potongan;
            double pajak = 0.05 * gaji_potongan;

            System.out.println("gaji bulanan :" + gajiBulanan);
            System.out.println("potongan :" + potongan);
            System.out.println("pajak :" + pajak);
            System.out.println("gaji berisih :" + (gaji_potongan - pajak));
        }
        if (jumlah_tidak_hadir <3) {
            double pajak = 0.05*gajiBulanan;
            double gaji_bersih =gajiBulanan-pajak;

            System.out.println(pajak);
            System.out.println(gaji_bersih);

        }









    }
}
