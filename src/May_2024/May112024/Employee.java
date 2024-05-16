package May_2024.May112024;

public class Employee {

    int empid ;
    String ename ;
    String dc;
    String role;
    int jl;
    long salary;

    public int getEmpid(){
       return empid;
    }

    public String getEname(){
        return ename;
    }

    public String getDc(){
        return dc;
    }

    public int getJl(){
        return jl;
    }

    public long getSalary(){
        return salary;
    }


    public void print() {
        System.out.println(" Employee ID is " + getEmpid());
        System.out.println(" Employee Name is  " + getEname());
        System.out.println(" Employee DC is " + getDc());
        System.out.println(" Employee JL is " + getJl());
        System.out.println(" Employee salary is " + getSalary());
    }
}
