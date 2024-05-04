package April_2024.HomeWork_23042024;

import java.util.Scanner;

public class PrimeNUmber {

// Program to Check if a Number is Prime or Not

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check Prime or Not: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

    }

    private static boolean isPrime(int number) {
        // All negative numbers, 0 and 1  are not a prime number

        if(number <=1){
            return false;
        }

        for (int i =2; i<number; i++){
            if(number % i ==0){
                return false;
            }
        }
        return true;

    }

}
