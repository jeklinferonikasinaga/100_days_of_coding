import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu menghitung luas :");
        System.out.println("1.persegi ");
        System.out.println("2.segitiga ");
        System.out.println("3.lingkaran");
        System.out.println("============================");
        System.out.print("pilihan anda adalah : ");
        int pilihan;
        double luas ;

        pilihan = sc.nextInt();
        if (pilihan==1) {
            double panjang,lebar;
            System.out.print("masukkan panjang :");
            panjang = sc.nextDouble();
            System.out.print("masukkan lebar :");
            lebar =sc.nextDouble();
            luas=panjang*lebar;
            System.out.print("luas persegi adalah :"+luas);

        } else if (pilihan==2) {
            double alas,tinggi;
            System.out.print("masukkan lebar :");
            alas = sc.nextDouble();
            System.out.print("masukkan tinggi :");
            tinggi = sc.nextDouble();
            luas = 0.5*alas*tinggi;
            System.out.print("luas segitiga adalah :"+luas);


        } else if (pilihan ==3) {
            double jari_jari;
            System.out.print("masukkan jari jari :");
            jari_jari =sc.nextDouble();
            luas = 3.14* jari_jari*jari_jari;
            System.out.print("luas lingkaran : "+luas);

        }
        else {
            System.out.println("periksa kembali input mu !!!!!!");
        }


    }
}
