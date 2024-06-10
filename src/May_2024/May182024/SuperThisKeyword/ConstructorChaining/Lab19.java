package May_2024.May182024.SuperThisKeyword.ConstructorChaining;

public class Lab19 {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.display();

        Dog d2 = new Dog("Lab");
        d2.display();

        Dog d3 = new Dog("Bomarien", "Women DOG");
        d3.display();

        Dog d4 = new Dog("GOLDEN Retriver", "MEN DOG", "A");
        d4.display2();

    }
}

class Animal{

    String type;
    Animal(){
        System.out.println("Animal - DC ");
    }

    Animal(String type){
        this.type = type;
        System.out.println("Animal - PC ");

    }

}


class Dog extends Animal{
    String breed;
    String a;
    Dog(){
//        // Constructor chaining ->  Child DC -> Parent's DC
//        super();       Is hidden here. This will be called automatically the parent when chile id called
        System.out.println("DOG - DC ");
    }


    Dog(String breed){
        super("Dog Type");

        this.breed=breed;
        System.out.println(" DOG - PC ");
    }

    Dog(String breed, String type){
//        super("DOG Type2");

//        super(type);
        this("Breed given by DOG only with PC2");  // PC2 is calling PC1 - Constructor chaining
        this.type = type;
//        this.breed=breed;
        System.out.println(" DOG - Two PC");
    }

    Dog(String breed ,String type, String a ){
        this("Breed given by DOG only with PC3", "MEN DOG"); // PC3 is calling PC2 - Constructor chaining
        this.a=a;
        System.out.println(" DOG - Three PC");
    }
    void display() {
        System.out.println("Type : " + type + " | Breed : " + breed);
    }

    void display2(){
        System.out.println("Type : " + type + " | Breed : " + breed + " | " + a);
    }
}