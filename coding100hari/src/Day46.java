import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan jari jari :");
        double jari_jari = sc.nextDouble();
        double pi = 3.14;
        double Luas_lingkaran =  pi * jari_jari*jari_jari   ;
        double keliling_lingkaran = 2*pi*jari_jari;
        System.out.println("luas  = "+Luas_lingkaran);
        System.out.println("keliling ="+keliling_lingkaran);
    }
}
