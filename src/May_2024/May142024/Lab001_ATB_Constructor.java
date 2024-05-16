package May_2024.May142024;

public class Lab001_ATB_Constructor {
    public static void main(String[] args) {

        // Default Constructor
        ATBPerson person1 = new ATBPerson();
        person1.name = "Amit";

        System.out.println(person1.name);
        System.out.println(person1.courseNme);
        System.out.println(person1.email);
        System.out.println(person1.phone);
        System.out.println(person1.isMarried);

        // Parameterized Constructor
        ATBPerson person2 = new ATBPerson("Jeni", 7894125562L);
        System.out.println(person2.name);
        System.out.println(person2.courseNme);
        System.out.println(person2.email);
        System.out.println(person2.phone);
        System.out.println(person2.isMarried);

        ATBPerson person4 = new ATBPerson("Rithika", true, 7854125562L);
        System.out.println(person4.name);
        System.out.println(person4.isMarried);
        System.out.println(person4.phone);



        ATBPerson person3 = new ATBPerson("ATB", false, "jenidiva@gmail.com", 89411225562L, "Divakar");
        System.out.println(person3.name);
        System.out.println(person3.courseNme);
        System.out.println(person3.email);
        System.out.println(person3.phone);
        System.out.println(person3.isMarried);
    }
}
