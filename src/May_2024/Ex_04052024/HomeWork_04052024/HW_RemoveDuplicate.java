package May_2024.Ex_04052024.HomeWork_04052024;

import java.util.Scanner;

public class HW_RemoveDuplicate {
//    Duplicate String - Hello World -> Helowrd

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the word to remove the duplicate letter : ");
        String original = sc.next();
        original = original.toLowerCase();
        String remove = "";

        for (int i = 0; i < original.length(); i++) {
            boolean check = false;
            for (int j=0; j< remove.length(); j++) {
                if (remove.charAt(j)==original.charAt(i)) {
                    check = true;
                    break;
                }
            }
            if(!check){
                remove = remove + original.charAt(i);
            }
        }

        System.out.println("Without Duplicate : " + remove);
    }

}
