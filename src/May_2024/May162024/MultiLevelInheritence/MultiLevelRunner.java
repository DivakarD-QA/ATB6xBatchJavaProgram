package May_2024.May162024.MultiLevelInheritence;

public class MultiLevelRunner {
    public static void main(String[] args) {
        GrandFather h1 = new GrandFather();
        System.out.println(" ----GrandFather");
        h1.home();
        h1.land();

        Fathers h2 = new Fathers();
        System.out.println(" *********Father");
        h2.home();
        h2.land();
        h2.car();

        Child h3 = new Child();
        System.out.println(" #######Child");
        h3.home();
        h3.land();
        h3.car();




    }
}
