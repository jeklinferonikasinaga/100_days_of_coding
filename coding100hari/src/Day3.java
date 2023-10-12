import java.sql.SQLOutput;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Nama;
        String NIM;
        String Jurusan;
        String Prodi;
        int Semester;

        System.out.print("input nama : ");
        Nama = sc.nextLine();
        System.out.print("input NIM : ");
        NIM = sc.nextLine();
        System.out.print("input jurusan : ");
        Jurusan = sc.nextLine();
        System.out.print("input prodi : ");
        Prodi = sc.nextLine();
        System.out.print("input semester : ");
        Semester = sc.nextInt();

        System.out.println("=====================================");

        System.out.println("Nama saya : "+Nama);
        System.out.println("NIM saya adalah : "+NIM);
        System.out.println("Jurusan saya adalah : "+Jurusan);
        System.out.println("Prodi saya adalah" +Prodi);
        System.out.println("Semester saya adalah " +Semester);

    }
}
