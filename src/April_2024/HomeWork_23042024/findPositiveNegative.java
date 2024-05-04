package April_2024.HomeWork_23042024;

import java.util.Scanner;

public class findPositiveNegative {

//    Program to Check if a Number is Positive, Negative, or Zero.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number --->  ");
        double num = sc.nextDouble();

        if (num > 0){
            System.out.println("Evem Number");
        } else if (num < 0) {
            System.out.println("Odd Number");
        }else
            System.out.println("Zero");

    sc.close();

    }
}
