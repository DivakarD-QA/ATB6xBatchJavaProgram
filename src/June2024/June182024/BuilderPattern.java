package June2024.June182024;

public class BuilderPattern {

    public BuilderPattern groundfloor(){
        System.out.println("Do some Task of Ground Floor");
        return this;
    }

    public BuilderPattern firstFloor(String name){
        System.out.println("Do some Task of first Floor " + name);
        return this;
    }

    public BuilderPattern secondFloor(String name, String color){
        System.out.println("Do some Task of second Floor "+ name +  " " + color);
        return this;
    }

    public static void main(String[] args) {
        BuilderPattern bp = new BuilderPattern();
        bp.groundfloor().firstFloor("FF").secondFloor("SF","RED");
    }
}
