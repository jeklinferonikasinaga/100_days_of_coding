import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("konversi berat kg ke g dan mg");

        System.out.println("masukkan kg :");
        double kg = sc.nextDouble();
        System.out.println("gram ="+kg*1000+"g");
        System.out.println("mili gram ="+kg*1000000+"mg");


    }
}
