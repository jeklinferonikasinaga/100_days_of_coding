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
            if (a <= b) {
                for (int i = a; i <= b; i++) {
                    System.out.println(i);
                }
            } else {
                for (int i = a; i >= b; i--) {
                    System.out.println(i);
                }
            }
        }
    }
}


