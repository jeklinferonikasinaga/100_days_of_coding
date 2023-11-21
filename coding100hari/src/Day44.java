import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Array = {"batu", "gunting", "kertas"};
        Random r = new Random();
        while (true) {
            System.out.print("masukkan pilihan anda (batu, gunting,kertas) : ");
            String pilihan_anda = sc.nextLine().toLowerCase();
            String pilihan_musuh = Array[r.nextInt(3)];
            if (pilihan_anda.equals(pilihan_musuh)) {
                System.out.println("pilihan anda :" + pilihan_anda);
                System.out.println("pilihan musuh :" + pilihan_musuh);
                System.out.println("seri/imbang");

            } else if (pilihan_anda.equals("gunting") && pilihan_musuh.equals("batu")
                    || pilihan_anda.equals("batu") && pilihan_musuh.equals("kertas")
                    || pilihan_anda.equals("kertas") && pilihan_musuh.equals("gunting")) {
                System.out.println("pilihan anda :" + pilihan_anda);
                System.out.println("pilihan musuh :" + pilihan_musuh);
                System.out.println("anda kalah");

            } else if (pilihan_anda.equals("gunting") && pilihan_musuh.equals("kertas")
                    || pilihan_anda.equals("batu") && pilihan_musuh.equals("gunting")
                    || pilihan_anda.equals("kertas") && pilihan_musuh.equals("batu")) {
                System.out.println("pilihan anda :" + pilihan_anda);
                System.out.println("pilihan musuh :" + pilihan_musuh);
                System.out.println("anda menang");


            } else {
                System.out.println("inputan anda nggak valid");
            }


        }
    }
}
