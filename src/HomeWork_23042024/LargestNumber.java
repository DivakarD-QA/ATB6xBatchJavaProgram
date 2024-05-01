package HomeWork_23042024;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

//        Program to Find the Largest Among Three Numbers:

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num 1");
        double num1 = sc.nextDouble();

        System.out.println("Enter the Num 2");
        double num2 = sc.nextDouble();

        System.out.println("Enter the Num 3");
        double num3 = sc.nextDouble();


        if (num1 == num2 || num1 == num3 || num3 == num2) {
            System.out.println(" --> Number are equal");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(" Num2 = " + num2 + " is the greatest");
        } else if (num1 > num2 && num1 > num3) {
            System.out.println(" Num1 = " + num1 + " is the greatest");
        } else
            System.out.println(" Num3 = " + num3 + " is the greatest");

        sc.close();

    }
}
