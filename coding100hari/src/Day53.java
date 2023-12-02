import java.util.Arrays;
import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int []nilai ={1,4,4,6,8,8,5,3,9,7};
        System.out.println(Arrays.toString(nilai));
        System.out.println("pilihan data:" );
        int pilih= input.nextInt();
        int indeks=-1;
        for (int i = 0; i < nilai.length; i++) {
            if(pilih == nilai[i]){
                indeks=i;
            }

        }
        if (indeks == -1) {
            System.out.println("data tidak ada");

        }else {
            System.out.println("index ke : "+indeks);
        }

    }
}
