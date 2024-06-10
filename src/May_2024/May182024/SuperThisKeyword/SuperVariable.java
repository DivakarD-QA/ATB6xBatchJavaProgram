package May_2024.May182024.SuperThisKeyword;

public class SuperVariable {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.maxSpeed);
        c.display();

    }
}

     class Car extends Vehicle{
        int maxSpeed = 120;

         public void display() {
             System.out.println(" Maximum speed of Car " + maxSpeed);
             System.out.println(" Maximum speed of Car " + this.maxSpeed);
             System.out.println(" Maximum speed of Car " + super.maxSpeed);
         }
     }


    class Vehicle{

        int maxSpeed = 100; // Instance variable

    }
