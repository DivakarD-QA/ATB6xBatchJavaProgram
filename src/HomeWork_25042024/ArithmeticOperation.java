package HomeWork_25042024;

import java.util.Scanner;

public class ArithmeticOperation {

    public static void main(String[] args) {

//        Switch Java Programs
//Program to Perform Arithmetic Operations
//
//Take a input from user, input1, input2 as int and ask the user what you want to do,
// enter char +,*,/ ,%, - , you will share the result by using the switch.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num 1");
        int num1 = sc.nextInt();

        System.out.println("Enter the Num 1");
        int num2 = sc.nextInt();

        System.out.println("Enter the Operation needed");
        char ope = sc.next().charAt(0);

        switch (ope) {
            case '+':
                System.out.println(" Result for Add --> " + (num1 + num2));
            break;

            case '*':
                System.out.println(" Result for Multiply --> " + (num1 * num2));
                break;

            case '/':
                System.out.println(" Result for Division --> " + (num1 / num2));
                break;

            case '-':
                System.out.println(" Result for Minus --> " + (num1 - num2));
                break;

            case '%':
                System.out.println(" Result for modulo --> " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid Input ......... ");


        }
sc.close();


    }
}
