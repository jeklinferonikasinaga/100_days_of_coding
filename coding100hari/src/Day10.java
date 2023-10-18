import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int penghasilan;
        String pekerjaan;
        double pajak ;
        double total_pajak = 0;

        System.out.print("masukkan penghasilan :");
        penghasilan = sc.nextInt();
        System.out.print("masukkan pekerjaan :");
        String dfs = sc.nextLine();
        pekerjaan = sc.nextLine();


        if (penghasilan >= 5000000) {

            pajak = 0.1;
            total_pajak = pajak*penghasilan;
        } else if (penghasilan >=3000000) {
            pajak = 0.05;
            total_pajak = pajak*penghasilan;
        }
        System.out.println("seorang "+pekerjaan+" dengan penghasilan "+penghasilan);
        System.out.println("memiliki gaji bersih adalah = "+(penghasilan-total_pajak));


    }
}
