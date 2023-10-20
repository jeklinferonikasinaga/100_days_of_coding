import java.util.Arrays;

public class Day11 {
        public static void main(String[] args) {
            double [][] data = {
                    {91.35 ,4.72 ,26 ,3.5 ,8 ,61 ,65.36, 12 ,5.6 ,7.11},
                    { 27 ,9.53, 549 ,2.23, 17.31 ,4.25 ,2.13, 83 ,7, 102.4},
                    {53.21, 3.42 ,0.21 ,70.02, 819.4 ,6173, 4.25 ,19.8 ,17.35 ,5.768}};
            for (int i = 0; i < data.length; i++) {
                System.out.println(Arrays.toString(data[i]));

            }
            double minimal = Integer.MAX_VALUE;
            double maksimal = Integer.MIN_VALUE;
            double sum = 0;
            double total_data =0;

            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    sum+=data[i][j];
                    total_data++;
                    if(data[i][j]<=minimal){
                        minimal = data[i][j];

                    }
                    if(data[i][j]>=maksimal) {
                        maksimal = data[i][j];
                    }

                }
            }
            double rata_rata = sum/total_data;
            System.out.println("nilai minimal adalah :"+minimal);
            System.out.println("nilai maksimal adalah :"+maksimal);
            System.out.println("total :"+sum);
            System.out.println("nilai rata-rata: "+rata_rata);
        }
    }

