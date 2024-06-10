package May_2024.May182024.AccessModifier;

public class DefaultVSempty {

    public void Village() {

        System.out.println("I am in Public Village");

    }

    void Town() {
        System.out.println("I am in Town");
    }

}



class Runner{
    public static void main(String[] args) {
        DefaultVSempty DE = new DefaultVSempty();
        DE.Town();
        DE.Village();
    }

}


