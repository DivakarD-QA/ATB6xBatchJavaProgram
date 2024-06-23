package May_2024.May232024.NestedClass.InnerClass;

public class Lab037 {
    public static void main(String[] args) {
        Car c = new Car("Volvo");
        c.drive();
        Car.Engine e = c.new Engine("5000 CC");
//        Car.Engine e = new Car.Engine();  if inner class is static
        e.start();
        Car.Engine.Gearbox g = e.new Gearbox(7);
        g.gear();
        Car.Engine.Gearbox.brake b = g.new brake(5);
        
        b.putBrake();

    }
}

class Car{
    // Instance Variables
    String make;

    public Car(String make) {
        this.make = make;
    }
    // Method
    void drive() {
        System.out.println("You can driver Car");
    }

    class Engine{
        // Instance Variables
        String horsepw = "4000CC" ;

        public Engine(String horsepw) {
            this.horsepw = horsepw;
        }

        void start(){
            System.out.println("Engine Start !!! " + make);
        }

        class Gearbox{
            int no_gear = 6;

            public Gearbox(int no_gear) {
                this.no_gear = no_gear;
            }
             void gear(){
                 System.out.println("Put the gear " + no_gear + " , I need full " + horsepw);
             }
    class brake{
            int braketime = 8;

        public brake(int braketime) {
            this.braketime = braketime;
        }

        void putBrake(){
                System.out.println("We are at " +no_gear+ "th gear, Brake will stop the car in " + braketime + " seconds");
            }
    }
        }
    }
}
