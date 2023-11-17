import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka 1 :");
        int angka1 = sc.nextInt();
        System.out.print(" masukkan angka 2 :");
        int angka2 = sc.nextInt();
        System.out.print("masukkan angka 3 :");
        int angka3 = sc.nextInt();
        int angka4 = angka1+angka2+angka3;





        if ( angka4%2== 1) {
            angka4+=1;// tambah 1 jika ganjil



        }
        else {
            angka4+=2;// tambah dua jika genap
        }
        System.out.print("hasil tambah :"+angka4);

    }
}
