package May_2024.May182024.Polymorphism.MethodOverloading.ConstructorOverloading;

import May_2024.May182024.Polymorphism.MethodOverloading.Lab020;

public class Lab021 {

    public static void main(String[] args) {
//        Constructor Overloading

        ConOv c = new ConOv();
        ConOv c2 = new ConOv("King");
        ConOv c3 = new ConOv("Don" , 12);
        ConOv c4 = new ConOv(13, "Boss");
        ConOv c5 = new ConOv(123);


    }
}

class ConOv{
    ConOv(){
        System.out.println(" DC ");
    }

    ConOv(String a){
        System.out.println(" String - ONE PC");
    }
    ConOv(int b){
        System.out.println(" Integer - ONE PC");
    }
    ConOv(String a, int b){
        System.out.println(" String And Interger - TWO PC");
    }

    ConOv(int b, String a){
        System.out.println(" Integer and String - TWO PC");
    }


}