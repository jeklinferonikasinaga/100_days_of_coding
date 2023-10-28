import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;

        angka = sc.nextInt();
        for (int i = 0; i <= angka; i++) {
            if (i==2 || i==3){
                System.out.println(i);
            }

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;


                } else if (i%3==0) {
                    break;

                } else {
                    System.out.println(i);
                    break;

                }

            }


        }
    }
}
