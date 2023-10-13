import java.util.Scanner;
public class Day5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int batas = sc.nextInt();
            int hasil =0;


            for (int i = 0; i <= batas ; i++) {
                System.out.print(i);
                if(i==batas){
                    System.out.print("=");
                }else{
                    System.out.print("+");
                }
                hasil+=i;

            }
            System.out.println(hasil);

    }
}
