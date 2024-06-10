package May_2024.May182024.Polymorphism.MethodOverriding;

public class Lab022 {
    public static void main(String[] args) {
        Dogg d = new Dogg();
        d.bark();

        Hound d2 = new Hound();
        d2.bark();

        Dogg d3 = new Hound();
        ((Hound) d3).fight();

        Dogg d4 = new Hound();
        d4.dance();
    }

    void main(String a){

    }
    void main(int  a){

    }
    void main(byte  a){

    }
}
