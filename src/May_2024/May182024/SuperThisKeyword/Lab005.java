package May_2024.May182024.SuperThisKeyword;

public class Lab005 {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();

        Teacher t = new Teacher();
        t.display();
    }
}

    class Student extends Teacher{
        void message(){
            System.out.println("I am a Student from Student Class");

        }
        void display(){
            this.message();
            super.message();
            System.out.println(" ------- Ending Student Class -------");
        }
    }

    class Teacher{
        void message(){
            System.out.println(" I am a Teacher from Teacher class");
        }

        void display(){
            this.message();
            
        }
    }