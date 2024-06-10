package May_2024.May162024.SingleInheritence;

public class Java extends Programming{
    String newFeature;

    public  Java(){
        System.out.println("DC = Child" );
    }
    public Java(String newFeature) {
        this.newFeature = newFeature;
    }

    public void printInfo(){
        System.out.println(" New Feature in Java --> " + newFeature);
    }


}
