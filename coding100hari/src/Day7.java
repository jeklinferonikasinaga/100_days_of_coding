import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double alas;
        double tinggi;
        System.out.print("masukkan alas : ");
        alas = sc.nextDouble();
        System.out.print("masukkan tinggi : ");
        tinggi = sc.nextDouble();

        double hasil = 0.5*alas*tinggi;
        System.out.println("hasil dari luas segitiga = "+hasil);

    }
}
