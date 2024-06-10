package May_2024.May182024.SuperThisKeyword.SuperMethod;

public class Lab007 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}

class Animal{
    void eat(){
        System.out.println(" Eating from Parent");
    }
}


class Dog extends Animal{
    void eat(){
        System.out.println(" Eating from Child");
    }

    public void display() {
//        this.eat();
        super.eat();
    }
}