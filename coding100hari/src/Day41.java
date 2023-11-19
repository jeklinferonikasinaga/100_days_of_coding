import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Masukkan Angka Desimal : ");
        int desimal = sc.nextInt();
        int pangkat = 128;
        int total=0;

        if(desimal >255){
            System.out.println("Melebihi Batas");
        }
        else {
            System.out.print("Bilangan Binner : ");
            for (int i = 0; i < 8; i++) {
                if(total+pangkat<=desimal){
                    total+=pangkat;
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
                pangkat/=2;
            }
        }
    }
}
