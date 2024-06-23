package May_2024.May232024.NestedClass.InnerClass;

public class Lab036 {
    // Nested Class -- two types
    // Static nested class and Inner class(non-static nested class)
    public static void main(String[] args) {
        OC c1 = new OC();
        c1.m1();
        OC.IC c2 = c1.new IC();
        c2.m2();

    }
}

class OC{
    int a =10;
    void m1(){
        System.out.println("Hi, OC " + a );
    }

    class IC{
        int b = 25;
        void m2(){
            System.out.println("Hi, IC. From OC we have " + a + " and IC have " + b);
        }
    }

}