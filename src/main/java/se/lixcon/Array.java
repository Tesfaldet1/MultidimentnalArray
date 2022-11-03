package se.lixcon;

public class Array {
    public static void main(String[] args) {
        int[] oneDimensionalArray =   {10, 12,14,16};
        System.out.println(oneDimensionalArray[3]);
        int [] [] MultiDimensionalArray = {{10,12,14,16}, {20,40,50,60},{11,21,31,41}};
        System.out.println(MultiDimensionalArray[1][2]);
        System.out.println(MultiDimensionalArray[2][1]);
        double [][] array = new double [2][4];
        array[1][1] =3.4;
        System.out.println(array[1][1]);
        for (int array1= 0; array1< MultiDimensionalArray.length; array1++){
            for(int item = 0; item<MultiDimensionalArray[array1].length; item++){
                System.out.println(MultiDimensionalArray[array1][item]);
            }

        }
        System.out.println();

    }
}
