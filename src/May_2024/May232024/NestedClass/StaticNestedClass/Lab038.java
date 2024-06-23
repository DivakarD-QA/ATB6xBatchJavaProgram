package May_2024.May232024.NestedClass.StaticNestedClass;

public class Lab038 {
    public static void main(String[] args) {

        OOC.SIC s = new OOC.SIC();  //if inner class is static
        s.show();

//        OOC.SIC s = o.new SIC();  // we cannot create object for static class

    }
}

class OOC {
    static int a = 10;
    int b = 5;

    static class SIC{
        void show(){
            System.out.println("Static Variable " + a);
        //    System.out.println(b); // Non static variable cannot be used in static class
        }
    }

}
