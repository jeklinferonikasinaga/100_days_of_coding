import java.util.Arrays;
import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String variabel_nama = sc.next();
        String [] nama = new String[variabel_nama.length()];
        for (int i = 0; i < variabel_nama.length(); i++) {
            nama [i]= String.valueOf(variabel_nama.charAt(variabel_nama.length()-i-1));

        }
        System.out.println(Arrays.toString(nama));

    }
}
