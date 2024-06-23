package May_2024.May212024.Abstract;

public class Lab029 {
    // Abstraction
    // Hide the Implementation
    // Car -. Engine, Types, brake, GearBox,
    // Drive help us to drive.
    // Abstract is the keyword.
    // abstract can be a class or method both.


    // Showing only the essential features of an object to the user
    // and hiding the inner details to reduce complexity.

    // How This implemented?
    // Abstract
    // Interface

    public static void main(String[] args) {
        pramod p = new pramod();
        p.atb();
        p.mtb();
    }
}


    class pramod extends B1{

        @Override
        void mtb() {
            System.out.println("MTB Completed");
        }

        @Override
        public void atb() {
            System.out.println("ATB Completed");
        }
    }

    abstract class B1 implements Course{
        abstract void mtb();
    }

    interface Course{
        void atb();
    }

