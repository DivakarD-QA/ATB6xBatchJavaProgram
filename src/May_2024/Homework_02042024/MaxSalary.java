package May_2024.Homework_02042024;

public class MaxSalary {
    public static void main(String[] args) {
//        Find the max salary in the input arrays {30,50,60,90,10, 100,999}

        int[] salary = {30,50,60,90,10,100,2500,31,70};

//        int max = salary[0];

//        using default Min value
        int max = Integer.MIN_VALUE;


        for (int i=0; i<salary.length; i++){
            if (salary[i] > max){
                max = salary[i];
            }
        }



//        using while loop

//        int j=0;
//        while(j < salary.length){
//            if (salary[j] > max){
//                max = salary[j];
//            }
//            j++;
//        }
        System.out.println("Maximum salary is " + max );
    }
}
