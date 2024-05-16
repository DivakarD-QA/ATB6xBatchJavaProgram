package May_2024.Ex_04052024.HomeWork_04052024;

import java.util.Scanner;

public class HW_ReverseString_ForLoop {
    public static void main(String[] args) {

//        Reverse a String without using any function or using for loop.

//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter the word which you want to reverse : ");
//        String word = sc.next();
//
//        for (int i = word.length() - 1; i >= 0; i--) {
//            System.out.print(word.charAt(i));

//------

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the word which you want to reverse : ");
        String str = sc.next();

        String nstr="";
//        char[] charArray = nstr.toCharArray();
        char ch;

        System.out.println("Original word: " + str);


        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);



    }
}
