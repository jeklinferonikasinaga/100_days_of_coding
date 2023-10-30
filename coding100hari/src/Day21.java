public class Day21 {
            public static void main(String[] args) {

                int[] data = {1, 2, 3, 4, 5};

                System.out.print("Isi array: ");
                for (int i = 0; i < data.length; i++) {
                    System.out.print(data[i]);
                    if (i < data.length - 1) {
                        System.out.print(", ");
                    }
                }
            }
        }


