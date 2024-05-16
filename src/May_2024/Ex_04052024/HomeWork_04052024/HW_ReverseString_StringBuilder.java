package May_2024.Ex_04052024.HomeWork_04052024;

public class HW_ReverseString_StringBuilder {
    public static void main(String[] args) {
//Reverse a String without using any function or using for loop.

        String input = "Geeks for Geeks";

        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1.reverse();

        // print reversed String
        System.out.println(input1);
    }
}
