package May_2024.Ex_04052024.HomeWork_04052024;

public class HW_Maxin2DArray {
    public static void main(String[] args) {
//  Write - Java method to find the maximum value in a 2D array
        int[][] arr = {
                {12, 64,78},
                {34,78,98},
                {43,63,11}
        };

//        int max = arr[0][0];
        int max = Integer.MIN_VALUE;

        for(int i=0; i< arr.length; i++) {
            for(int j=0; j< arr.length; j++){

                if (arr[i][j] > max ){
                    max = arr[i][j] ;
                }
            }
        }

        System.out.println("Maximum value is " + max );



    }
}
