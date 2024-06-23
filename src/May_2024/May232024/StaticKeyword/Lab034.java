package May_2024.May232024.StaticKeyword;

public class Lab034 {
    public static void main(String[] args) {

        // Static -> variable, block or method
        // Static variables, method  can be accessed by ClassName
        // They belong to class.
        // They are loaded when class is loaded( CL)
        // Static block is executed 1 time, when class is loaded.

        Person p1 = new Person("Rocky");
        Person p2 = new Person("Pushpa");
        p1.m1();
        p1.m2();
        p2.m1();
        p2.m2();
        Person.m1();
        // Person.m2(); not possible non static method

        System.out.println("------");
        System.out.println(Person.footBallClub);

        System.out.println("After change ---------");
        Person.footBallClub = "ManU";
        System.out.println(p1.footBallClub);
        System.out.println(p2.footBallClub);

        p1.name = "Lucky";
        System.out.println(p1.name);
        p1.m2();
        p2.m2();

    }
}

class Person {
    static String footBallClub = "Arsenal";
    static {
        System.out.println("Once, When class is loaded");
    }

    {
        System.out.println("IIB");
    }

    static void m1(){
        System.out.println("I am common F(n) - m1 " );
    }
     String name; // non static
    void m2(){
        System.out.println("m2 Person --> " + this.name);
    }

    public Person(String name) {
        this.name = name;
    }
}