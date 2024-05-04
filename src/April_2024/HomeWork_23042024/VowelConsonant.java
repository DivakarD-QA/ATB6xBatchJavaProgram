package April_2024.HomeWork_23042024;

import java.util.Scanner;

public class VowelConsonant {

//    Program to Check if a Character is a Vowel or a Consonant.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet");
        char alp = sc.next().charAt(0);

        if (alp == 'a' || alp == 'e' || alp == 'i' || alp == 'o' || alp == 'u' ||

                alp == 'A' || alp == 'E' || alp == 'I' || alp == 'O' || alp == 'U')
        {
            System.out.println( " Vowel ^^ ");
        } else
            System.out.println( " Consonant *** ");
sc.close();
    }

}
