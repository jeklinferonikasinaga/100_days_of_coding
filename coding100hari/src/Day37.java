import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int awal = sc.nextInt();
        for (int i = awal-1; i >0 ; i--) {
            if (i % 5==0){
                System.out.println("Kelipatan 5");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
