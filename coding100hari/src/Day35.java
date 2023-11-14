package aritmatika;

import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan angka 1 :");
        int angka1;
        angka1 = sc.nextInt();
        System.out.println("masukka angka 2 :");
        int angka2 = sc.nextInt();


        System.out.println(angka1+ "+" +angka2+ "=" +(angka1+angka2));
        System.out.println(angka1+ "-" +angka2+ "=" +(angka1-angka2));
        System.out.println(angka1+ "*" +angka2+ "=" +(angka1*angka2));
        System.out.println(angka1+ " :" +angka2+ "=" +(angka1/angka2));
        System.out.println(angka1+ " %" +angka2+ "=" +(angka1%angka2));



    }
}
