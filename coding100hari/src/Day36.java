package InputdanOutput;

import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan nama depan :");
        String nama_depan ;
        nama_depan = sc.nextLine();
        System.out.println("masukkan nama belakang :");
        String nama_belakang ;
        nama_belakang = sc.nextLine();
        System.out.println("masukkan umur :");
        int umur ;
        umur = sc.nextInt();
        System.out.println("masukkan tinggi :");
        double tinggi ;
        tinggi  = sc.nextDouble();
        System.out.println("masukkan berat badan :");
        double berat_badan ;
        berat_badan = sc.nextDouble();
        System.out.println("masukkan status pernikahan :");
        boolean status_pernikahan ;
        status_pernikahan = sc.nextBoolean();
        System.out.println("masukkan nomor hp :");
        String nomor_telepon;
        nomor_telepon = sc.nextLine();
        nomor_telepon = sc.nextLine();


        System.out.println(nama_depan);
        System.out.println(nama_belakang);
        System.out.println(umur);
        System.out.println(tinggi + "meter");
        System.out.println(berat_badan+ "kg");
        System.out.println(status_pernikahan);
        System.out.println(nomor_telepon);

    }
}
