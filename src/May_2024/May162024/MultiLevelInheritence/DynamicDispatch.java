package May_2024.May162024.MultiLevelInheritence;

public class DynamicDispatch {
    public static void main(String[] args) {

        // Dynamic dispatch
        GrandFather gf1 = new GrandFather();
        gf1.home();
        GrandFather gf2 = new Fathers();
        gf2.home();
        GrandFather gf3 = new Child();
        gf3.home();

    }
}
