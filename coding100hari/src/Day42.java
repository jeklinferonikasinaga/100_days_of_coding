import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;



        while(true) {
            System.out.println("masukkan angka :");
            int angka = sc.nextInt();
            total+=angka;
            System.out.println("total :"+total);
        }

    }
}
