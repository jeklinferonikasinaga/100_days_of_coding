import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan angka biner :");
        String angka_biner = sc.nextLine();
        int pangkat =1;
        int total = 0;

        for (int i = 0; i < angka_biner.length(); i++) {
            if (angka_biner.charAt(angka_biner.length()-1-i) == '1') {
                total+=pangkat;

            }
            pangkat*=2;
        }
        System.out.println("Bentuk Desimal : "+total);
    }
}
