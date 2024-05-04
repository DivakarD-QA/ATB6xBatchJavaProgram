package May_2024.Homework_02042024;

public class DoubleAnArray {

    public static void main(String[] args) {
//        Create a Program to double an array and store it also.
     int[] array = {1,2,3};
        int[] array2 = new int[3];

     for (int i=0; i<array.length; i++){
        array2[i] = array[i]*2;

     }

     for (int j=0; j< array2.length; j++ ) {
         System.out.println(" The value of the new array2 at " + j + "----");
         System.out.println(array2[j]);
     }

    }

}
