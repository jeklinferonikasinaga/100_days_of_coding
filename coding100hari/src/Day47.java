import java.util.Random;
import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        while (true) {
            int a = rd.nextInt(100);
            int b = rd.nextInt(100);
            String array[] = {"-", "+"};
            String soal = array[rd.nextInt(2)];
            int hasil = 0;
            if (soal.equals("-")) {
                hasil = a - b;

            } else if (soal.equals("+")) {
                hasil = a + b;

            }
            System.out.println("soal anda :");
            System.out.print(a + " " + soal + " " + b + " = ");
            int jawaban = sc.nextInt();
            if (jawaban == hasil) {
                System.out.println("jawaban benar");

            } else {
                System.out.println("jawaban anda salah ");
                System.out.println("jawaban yang benar adalah :"+hasil);
            }

        }
    }
}
