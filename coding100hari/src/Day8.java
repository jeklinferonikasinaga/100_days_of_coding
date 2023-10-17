import java.util.Arrays;

public class Day8 {
    public static void main(String[] args) {
        int [] array_1D_int ={1,2,3,4,5};
        double [] array_1D_double ={1.7,1.5,2.2};
        Double [] array_1D_Double ={3.7,4.5,1.2};
        Integer [] array_1D_Integer ={9,1,2,3,4};
        String [] array_1D_String ={"satu","dua","tiga"};
        char [] array_1D_char={'A','B','C'};
        float [] array_1D_float ={1.7f,4.5f,1.2f};

        System.out.println("Array 1D int :"+ Arrays.toString(array_1D_int));
        System.out.println("Array 1D double :"+ Arrays.toString(array_1D_double));
        System.out.println("Array 1D Double :"+ Arrays.toString(array_1D_Double));
        System.out.println("Array 1D Integer :"+ Arrays.toString(array_1D_Integer));
        System.out.println("Array 1D String :"+ Arrays.toString(array_1D_String));
        System.out.println("Array 1D char :"+ Arrays.toString(array_1D_char));
        System.out.println("Array 1D float :"+ Arrays.toString(array_1D_float));

        System.out.println("============================================");
        int [][] array_2D_int ={
                {1,2,3},
                {2,3,1}
        };
        double [][] array_2D_double ={
                {1.2,3.1},
                {2.2,3.3,1.7}
        };
        Double [][] array_2D_Double = {
                {2.2, 10.1},
                {2.1, 9.2}
        };

        Integer [][] array_2D_Integer ={
                {1,2,3},
                {4,5,6}

        };
        String [][] array_2D_String ={
                {"satu","dua","tiga"},
                {"empat","lima"}

        };
        char [][] array_2D_char ={
                {'A','B'},
                {'C','D'}


        };
         float[][] array_2D_float ={
                {2.2f,10.1f},
                {2.1f,9.2f}

        };
        System.out.println("Array 2D int : "+Arrays.deepToString(array_2D_int));
        System.out.println("Array 2D double : "+Arrays.deepToString(array_2D_double));
        System.out.println("Array 2D Double : "+Arrays.deepToString(array_2D_Double));
        System.out.println("Array 2D Integer : "+Arrays.deepToString(array_2D_Integer));
        System.out.println("Array 2D String : "+Arrays.deepToString(array_2D_String));
        System.out.println("Array 2D char: "+Arrays.deepToString(array_2D_char));
        System.out.println("Array 2D float: "+Arrays.deepToString(array_2D_float));

        System.out.println("============================================");
        int [][][] array_3D_int ={
                {
                    {1,2,3}, {4,5,6}
                },
                {
                    {7,8,9},{10,11,12}
                }
        };
        double [][][] array_3D_double ={
                {
                    {1.2,3.2}, {4.4,5.5}
                },
                {
                    {7.8,9.2},{10.11,12.13}
                }
        };
        Double [][][] array_3D_Double ={
                {
                    {3.2,3.2}, {9.4,5.5}
                },
                {
                    {10.8,11.2},{10.11,12.1}
                }
        };
        Integer [][][] array_3D_Integer={
                {
                    {3,2,3,2}, {9,4,5,5}
                },
                {
                    {1,2},{4,2}
                }
        };
        String [][][] array_3D_String={
                {
                    {"satu","dua"}, {"tiga","empat"}
                },
                {
                    {"seratus","satu"},{"lima","sepuluh"}
                }
        };
        char [][][] array_3D_char={
                {
                    {'A','B'}, {'C','D'}
                },
                {
                    {'E','F'},{'G','H'}
                }
        };
        float [][][] array_3D_float={
                {
                        {3.2f,3.2f}, {9.4f,5.5f}
                },
                {
                        {1.2f},{4.2f}
                }
        };
        System.out.println("Array 3D int : "+Arrays.deepToString(array_3D_int));
        System.out.println("Array 3D double : "+Arrays.deepToString(array_3D_double));
        System.out.println("Array 3D Double : "+Arrays.deepToString(array_3D_Double));
        System.out.println("Array 3D Integer : "+Arrays.deepToString(array_3D_Integer));
        System.out.println("Array 3D String : "+Arrays.deepToString(array_3D_String));
        System.out.println("Array 3D char: "+Arrays.deepToString(array_3D_char));
        System.out.println("Array 3D float: "+Arrays.deepToString(array_3D_float));






    }

}
