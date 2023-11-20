import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan batas nilai awal :");
        int nilaiAwal = sc.nextInt();
        System.out.println("masukkan batas nilai akhir ");
        int nilaiAkhir = sc.nextInt();

        for (int i = nilaiAwal; i >= nilaiAkhir; i--) {
            System.out.println(i);
            if (i%2 == 0) {
                System.out.println("genap");
            }else {
                System.out.println("ganjil");
            }
        }



    }
}
