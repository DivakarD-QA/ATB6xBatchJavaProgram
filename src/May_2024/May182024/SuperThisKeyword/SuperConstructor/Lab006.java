package May_2024.May182024.SuperThisKeyword.SuperConstructor;

public class Lab006 {
    public static void main(String[] args) {
        Student1 s = new Student1();
        // If child has DC -> Parent DC will also be called
        // super() automatically in Java

//        Teacher1 t1 = new Teacher1();
//        Student1 s1 = new Student1("JENI");

//        Student1 s2 = new Student1("MIA", 48);


    }

}

    class Student1 extends Teacher1{

    Student1 (){

//        super();   Will be there automatically in Child

//        super("JENIFER");
//        this("Rithika");

//        super("Sunny", 46);
        this("Danny", 38);


        System.out.println(" DC - Student1 --> Child");
    }

    Student1(String a){
        System.out.println(" PC - Student1 with one Parameter --> Child *** " + a);
    }

        Student1(String a, int b){
            System.out.println(" PC - Student1 with two Parameter --> Child " + a + " has " + b + " inches");
        }

    }

    class Teacher1 {

        Teacher1() {

            System.out.println(" DC - Teacher1 ---> Parent");

        }

        Teacher1(String b) {
            System.out.println(" PC - Teacher1 --> Parent " + b);
        }

        Teacher1(String a, int b){
            System.out.println(" PC - Teacher1 with two Parameter --> Parent " + a + " has " + b + " inches");
        }
    }