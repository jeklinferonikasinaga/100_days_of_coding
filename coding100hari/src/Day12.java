import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  tanggal;
        int bulan_lahir;
        String zodiak ="";
        System.out.print("masukkan tanggal lahir :");
        tanggal = sc.nextInt();
        System.out.print("masukkan bulan lahir :");
        bulan_lahir =sc.nextInt();

        if (tanggal >=21 && bulan_lahir==3||bulan_lahir==4&&tanggal<=19) {
            zodiak ="aries";
                       
        } else if (tanggal>=20&&bulan_lahir==4||bulan_lahir==5&&tanggal<=20) {
            zodiak ="taurus";
            
        }
        else if (tanggal>=21&&bulan_lahir==5||bulan_lahir==6&&tanggal<=20) {
            zodiak ="gemini";

        }
        else if (tanggal>=21&&bulan_lahir==6||bulan_lahir==7&&tanggal<=22) {
            zodiak ="cancer";

        }
        else if (tanggal>=23&&bulan_lahir==7||bulan_lahir==8&&tanggal<=22) {
            zodiak ="leo";

        }
        else if (tanggal>=23&&bulan_lahir==8||bulan_lahir==9&&tanggal<=22) {
            zodiak ="virgo";

        }
        else if (tanggal>=23&&bulan_lahir==9||bulan_lahir==10&&tanggal<=22) {
            zodiak ="libra";

        }
        else if (tanggal>=23&&bulan_lahir==10||bulan_lahir==11&&tanggal<=21) {
            zodiak ="scorpio";

        }
        else if (tanggal>=22&&bulan_lahir==11||bulan_lahir==12&&tanggal<=21) {
            zodiak ="sagitarius";

        }

        else if (tanggal>=22&&bulan_lahir==12||bulan_lahir==1&&tanggal<=19) {
            zodiak ="capricorn";

        }
        else if (tanggal>=20&&bulan_lahir==1||bulan_lahir==2&&tanggal<=18) {
            zodiak ="aquarius";

        }
        else if (tanggal>=19&&bulan_lahir==2||bulan_lahir==3&&tanggal<=20) {
            zodiak ="pisces";

        }
        System.out.println("ZODIAK ANDA ADALAH :"+zodiak);


    }
}
