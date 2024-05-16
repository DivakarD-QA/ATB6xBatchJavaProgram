package May_2024.HomeWork_11052024_OOPS;

public class Course {

    char courseName;
    String mentor;
    int startDate;
    int endDate;

    // no return no parameter
    public static void getCourseName(){
        System.out.println( " ATB6x Batch Java Program ");

    }

    // no retrun with parameter
    public void getMentor(){
        System.out.println( " Mentor of ATB6x Batch Java Program is " + mentor);
    }

    //  return no parameter
    public int getStartDate() {
        return startDate;
    }

    // return with parameter
    public int getEndDate(int endDate){
        return endDate;
    }



    


}
