import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        while (true) {
            System.out.print("masukkan nilai a : ");
            a = sc.nextInt();
            System.out.print("masukkan nilai b : ");
            b = sc.nextInt();
            int awal,akhir;
            if (a < b) {
                awal = a;
                akhir = b;
            } else {
                awal = b;
                akhir = a;
            }
            for(int i = awal;i <= akhir ; i++){
                System.out.println(i);
            }
        }
    }
}


