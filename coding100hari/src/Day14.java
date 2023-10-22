public class Day14 {
    public static void main(String[] args) {
        double [] data = {
                91.35 ,4.72 ,26 ,3.5 ,8 ,61 ,65.36, 12 ,5.6 ,7.11,
                27 ,9.53, 549 ,2.23, 17.31 ,4.25 ,2.13, 83 ,7, 102.4,
                53.21, 3.42 ,0.21 ,70.02, 819.4 ,6173, 4.25 ,19.8 ,17.35 ,5.768};
        System.out.print("[");
        double min =Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        double avg = 0;
        double sum =0;

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
            if (i <= data.length-1) {
                System.out.print(", ");
            }
            sum+=data[i];
            if ( data[i]<=min) {
                min =data[i];

            }
            if (data[i]>= max) {
                max =data[i];

            }

        }
        avg = sum/ data.length;
        System.out.println(" ]");
        System.out.println("jumlah datanya adalah :"+sum);
        System.out.println("jumlah nilai minimalnya adalah  :"+min);
        System.out.println("jumlah nilai maksimal adalah : "+max);
        System.out.println("nilai rata rata adalah : "+avg);
    }
}
