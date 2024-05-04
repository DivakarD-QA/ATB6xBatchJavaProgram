package April_2024.HomeWork_23042024;

import java.util.Scanner;

public class FizzBuzz_UserInput {
    public static void main(String[] args) {
//         FizzBuzz Test:
//Write a program that prints numbers from 1 to 100. However,
// for multiples of 3, print "Fizz" instead of the number,
// and for multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number from 1 to 100");
        int n = sc.nextInt();

            if(n % 3 ==0 && n%5==0){
                System.out.println(" FizzBuzz ***** " + n + " multiples of both 3 and 5" );
            } else if (n % 3 ==0) {
                System.out.println(" Fizz >>> " + n + " is multiples of 3 " );
            }else if (n % 5 ==0) {
                System.out.println(" Buzz !!! " + n + " is multiples of 5 ");
            } else
                System.out.println( " Number " + n +" is either not divisible by 5 or 3 / or not between 1 and 100");

sc.close();
    }
}
