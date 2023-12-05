import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("menghitung umur dalam hari");

            System.out.println("masukkan tanggal lahir :");
            int tanggal_lahir = sc.nextInt();
            System.out.println("masukkan bulan lahir :");
            int bulan_lahir = sc.nextInt();
            System.out.println("masukkan tahun lahir :");
            int tahun_lahir = sc.nextInt();

            System.out.println("masukkan tanggal sekarang :");
            int tanggal_sekarang = sc.nextInt();
            System.out.println("masukkan bulan  sekarang  :");
            int bulan_sekarang = sc.nextInt();
            System.out.println("masukkan tahun sekarang :");
            int tahun_sekarang = sc.nextInt();

            int tahun_tampung = tahun_sekarang-tahun_lahir;
            int bulan = bulan_sekarang-bulan_lahir;
            int tanggal = tanggal_sekarang-tanggal_lahir;

            System.out.println("umur anda dalam hari = "+(tahun_tampung*365+bulan*30+tanggal)+" hari");


            }

        }
    }

