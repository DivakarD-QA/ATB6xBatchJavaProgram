package April_2024.HomeWork_23042024;

public class FizzBuzz_1to100 {
    //         FizzBuzz Test:
//Write a program that prints numbers from 1 to 100. However,
// for multiples of 3, print "Fizz" instead of the number,
// and for multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."

    public static void main(String[] args) {

        for (int n = 1; n <= 100; n++) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println(" FizzBuzz ***** " + n + " is multiples of both 3 and 5");
            } else if (n % 3 == 0) {
                System.out.println(" Fizz >>> " + n + " is multiples of 3");
            } else if (n % 5 == 0) {
                System.out.println(" Buzz !!! " + n + " is multiples of 5 ");
            } else
                System.out.println(" #### Number " + n + " is not divisible by 5 or 3 ");

        }
    }
}
