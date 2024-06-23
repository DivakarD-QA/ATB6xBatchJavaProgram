package May_2024.May232024.StaticKeyword;

public class Lab035 {
    public static void main(String[] args) {

        App a = new App();
        App b = new App();
        // System.out.println(App.age); // non-static variable age cannot be referenced from a static context
        System.out.println(a.age);
        System.out.println(b.age);

        System.out.println(App.common);
        System.out.println(a.common);
        System.out.println(b.common);

        App.m1();
        a.m1();
        b.m1();


      //  App.m2();   // non-static variable
        a.m2();
        b.m2();

        System.out.println("------Null object----");

        App c = null;  //IIB will not called
        App.m1();
        c.m1();
//        c.m2(); //Instance can't access.  NullPointerException


    }
}


class App{
    int age = 10;
    static String common = "ABC";

    static {
        System.out.println("Once, When class is loaded");
    }

    {
        System.out.println("IIB");
    }

    static void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
    }
}