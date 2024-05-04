package May_2024.Ex_04052024.HomeWork_04052024;

import java.util.Scanner;

public class HW_ValueExistInArray {
    public static void main (String[] args) {

//        Write a Java method to check if a given element exists in a 2D array.

        int[][] arr = {
                {12, 64,78},
                {34,78,98},
                {43,63,11}
        };



        Scanner sc = new Scanner(System.in);
        System.out.println( " Enter the value which you need to check if exist ");
        int exist = sc.nextInt();
        int times = 0;

        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr.length; j++){
                if(arr[i][j] ==  exist ) {
                    exist = arr[i][j];
                    System.out.println(" The input is exist in the array ");
                    times++;

                }

                }

            }

        if(times==0)
            System.out.println("Element "+ exist +" is NOT present in array");
        else{
            System.out.println(" 34The input is exist " + times + " times " );
        }
        }



    }

