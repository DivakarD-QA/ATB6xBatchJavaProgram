package May_2024.May182024.Polymorphism.MethodOverloading;

public class Lab020 {

    // Method OverLoading -> multiple methods with same name, but different argument.
    // order also matters

    void Gift(String a){
        System.out.println(" a is a String - " + a);
    }

    void Gift(int b){
        System.out.println(" b is a INT - " + b);
    }
    void Gift(int b, String e){
        System.out.println(" b is a INT - " + b + " and e is the String - " + e);
    }

    void Gift(String e, int b){
        System.out.println( " e is the String - " + e + " and b is a INT - " + b );
    }
    void Gift(float c){
        System.out.println(" c is a Float " + c);
    }

    void Gift(double d){
        System.out.println(" d is a Double " + d);
    }

    void Gift(int f, int g){
        System.out.println(" Both are Integer - " + f + " and " + g);
    }
//    MethodOverloading is not possible for the same parameter
//    void Gift(int g, int f){
//        System.out.println(" Both are Integer - " + f + " and " + g);
//    }
    public static void main(String[] args) {
        Lab020 p = new Lab020();
        p.Gift("Jeni");
        p.Gift(12);
        p.Gift(3.333387f);
        p.Gift(12.221);
        p.Gift(3,"GUn");
        p.Gift("Gun", 45);
        p.Gift(34, 3445);
    }
}
