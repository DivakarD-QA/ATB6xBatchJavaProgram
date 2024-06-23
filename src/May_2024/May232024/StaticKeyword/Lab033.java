package May_2024.May232024.StaticKeyword;

public class Lab033 {
    public static void main(String[] args) {
        // Static
        // Data member
        // Function
        // Class
// Static loads when Class is loaded. -

        ATB p1 = new ATB("123");
//        System.out.println(p1.phno);
        p1.print();

        ATB p2 = new ATB("12123133");
//        System.out.println(p2.phno);
        p2.print();

        // if static we can access via class name
        System.out.println(ATB.courseName);

    }
}

class ATB{

    static String courseName = "ATB6X";
    String phno;

    static {
        System.out.println("SIB - Load one Time, Class IS LOADED");
    }

    {
        System.out.println("IIB - instance initialization block. Loaded when Object is created before execution");
    }


    public ATB(String phno) {
        this.phno = phno;
    }
    public  void print(){
        System.out.println("Your Details -> " +  this.phno);
    }
}
