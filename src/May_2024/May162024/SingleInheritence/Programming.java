package May_2024.May162024.SingleInheritence;

public class Programming {
    double version;
    String author;
    public Programming(double version, String author) {
        System.out.println( "----Parameterized Constructor");
        this.version = version;
        this.author = author;
    }


   public Programming(){
        System.out.println("DC - Parent");
    }

    public void printInfo(){
        System.out.println( "Programming Info --> " + version + " and Author : " + author);
        
    }
}
