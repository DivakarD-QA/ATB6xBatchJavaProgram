package May_2024.Ex_04052024.HomeWork_04052024;

public class HW_TransposeArray {
    public static void main(String[] args) {

        int[][] org = {
                {1,4,7} ,
                {2,5,8} ,
                {3,6,9}
        };

        int[][] tra = new int [3][3];

//        Assigning the values
        for ( int i=0; i< org.length; i++){
            for(int j=0; j< org.length; j++){
                 tra[i][j] = org[j][i];
            }
        }

//         Printing the original array

        System.out.println(" Original Array ");
        for ( int i=0; i< org.length; i++){
            for(int j=0; j< org.length; j++){
                System.out.print(org[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println(" ---------------- ");
        System.out.println(" Transpose Array ");
        for ( int i=0; i< org.length; i++){
            for(int j=0; j< org.length; j++){
                System.out.print(tra[i][j] + " ");

            }
            System.out.println();
        }

    }
}
