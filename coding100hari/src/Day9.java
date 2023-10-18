import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka1;
        int angka2;
        int angka3;
        int hasil;
        System.out.print("masukkan angka 1 : ");
        angka1 = sc.nextInt();
        System.out.print("masukkan angka 2 : ");
        angka2 = sc.nextInt();
        System.out.print("masukkan angka 3 : ");
        angka3 = sc.nextInt();

        hasil = angka1+angka2;
        System.out.println("hasil dari penjumlahan angka = "+angka1+"+"+angka2+"="+hasil);
        hasil = angka1+angka2+angka3;
        System.out.println("hasil dari penjumlahan angka = "+angka1+"+"+angka2+"+" +angka3+"="+hasil);

        hasil = angka2+angka2;
        System.out.println("hasil dari penjumlahan angka = "+angka2+"+"+angka2+"=" +hasil);




    }
}
