package May_2024.May162024.SingleInheritence;

public class Lab003_Runner {

    public static void main(String[] args) {

        Programming p = new Programming();
        p.printInfo();

        Programming p2 = new Programming( 14.1 , "KO posan");
        p2.printInfo();

        System.out.println( " ////// JAVA STARTS");

        Java j = new Java();
        j.printInfo();

        Java j2 = new Java("OOPS");
        j2.printInfo();
    }
}
