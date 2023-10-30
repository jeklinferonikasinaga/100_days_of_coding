public class Day22 {
        public static void main(String[] args) {

            int[][][] data ={
                    {
                        {1, 2, 3},{4, 5, 6}
                    },
                    {
                        {7, 8, 9}, {10, 11, 12}
                    }
            };

            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    for (int k = 0; k < data[i][j].length; k++) {
                        System.out.println("data[" + i + "][" + j + "][" + k + "] = " +data[i][j][k]);
                    }
                }
            }
        }
    }


