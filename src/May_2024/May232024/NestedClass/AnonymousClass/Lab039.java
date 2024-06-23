package May_2024.May232024.NestedClass.AnonymousClass;

public class Lab039 {
    public static void main(String[] args) {
        ABC a = new ABC() {
            @Override
            void m2() {
            }
        };
        a.m1();
        a.m2();


    I1 i = new I1() {
        @Override
        public void m4() {
        }
    };

    i.m4();
    i.m3();

    }
}

abstract class ABC{
    void m1(){
        System.out.println("Abstract Class - m1");
    }

    abstract void m2();

}

interface I1{
    default void m3(){
        System.out.println("Interface class - m3");
    };

    void m4();
}