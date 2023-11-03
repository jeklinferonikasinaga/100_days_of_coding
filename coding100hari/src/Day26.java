import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gaji_pokok;
        System.out.print("masukkan gaji pokok : ");
        gaji_pokok = sc.nextInt();
        int gaji_lembur = 55000;
        int lama_lembur ;
        System.out.print("masukkan lama lembur : ");
        lama_lembur = sc.nextInt();
        int  gaji_bersih = gaji_lembur*lama_lembur+gaji_pokok;
        System.out.print("gaji bersih nya adalah : " +gaji_bersih);




    }
}
