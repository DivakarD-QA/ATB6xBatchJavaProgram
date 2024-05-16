package May_2024.May142024;

public class ATBPerson {

    public ATBPerson(String name, boolean isMarried, long phone) {
        System.out.println( " Parameterized Constructor with 3 parameter");
        this.name = name;
        this.isMarried = isMarried;
        this.phone = phone;
    }

    String name;
        long phone;
        String email;
        boolean isMarried;
        String courseNme;


    public ATBPerson(String courseNme, boolean isMarried, String email, long phone, String name) {
        System.out.println( " Parameterized Constructor with ALL parameter");
        this.courseNme = courseNme;
        this.isMarried = isMarried;
        this.email = email;
        this.phone = phone;
        this.name = name;
    }


        // Constructor
        // default - Constructor
            // DC
            // Special Method with no return type
            // 1 called, when you create new Object
            // It has same name as the className

        ATBPerson(){
            System.out.println( " Default Constructor ");
            courseNme = "ATB";
        }

        //parameterized constructor
        ATBPerson(String name, long phone){
            System.out.println( " Parameterized Constructor with 2 parameter");
            this.name = name;
            this.phone = phone;
        }


    }
