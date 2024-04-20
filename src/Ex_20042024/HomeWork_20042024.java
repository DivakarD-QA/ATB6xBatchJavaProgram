package Ex_20042024;

public class HomeWork_20042024 {
    public static void main(String[] args) {

//        Question 1
        int a1 = 10, b1 = 25, c1 = 15 ;

        int max = (a1 > b1) ? (a1 > c1 ? a1 : c1) : (b1 > c1 ? b1 : c1);

        System.out.println("Maximum number among " + a1 + ", " + b1 + " and " + c1 + " is " + max);

        System.out.println("Question 1 - The maximum number is " + max);
        System.out.println("----------------");

//        Question 2
        int a = 10;
        System.out.println("Question 2 result = " + (++a + a++ + a++));
        System.out.println("----------------");

// Question 3
        int b = 10;
        System.out.println("Question 3 result = " + (--b + b++ + ++b));
//        9 +9+11
        System.out.println("----------------");

// Question - 4

        double x = 10;
        double y = 12.4;
        double z = 56.78d;

        double sum = Math.pow(x , 2) + Math.pow(y , 2) - Math.abs(z);

        System.out.println("Value of x^2 + y^2 - |z| = " + sum);

        double result = Math.cbrt(sum);
        System.out.println("Question 4 - Value of cube root = " + result);

    }
}
