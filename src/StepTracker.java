import java.util.Scanner;
public class StepTracker{
    //properties
    private int stepsForActiveDay;
    private int activeDays;
    private int days;
    //constructor
    public StepTracker(int stepsForActiveDay){
        this.stepsForActiveDay=stepsForActiveDay;
        this.days=0;
        this.activeDays=0;
    }
    //get__ methods for each property(3)
    public int getStepsForActiveDay(){
        return stepsForActiveDay;
    }
    public int getActiveDays(){
        return activeDays;
    }
    public int getDays(){
        return days;
    }

    public int[] DailySteps(int days){
        int number=1;
        int[] dailySteps=new int[days];//new array=size of no. of days.
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < days; i++) {
            if (days<1){
                break;
            }

            System.out.println("Day "+number+" steps: ");
            dailySteps[number]=scanner.nextInt();
            number++;
        }
        return dailySteps;
    }

    public int activeDays(int stepsForActiveDay, int[] dailySteps){
        for (int i=0;i<dailySteps.length-1;i++){
            if (i>stepsForActiveDay){
                activeDays++;
            }
        }
        return activeDays;
    }

    public int addDailySteps(int[]dailySteps){
        int totalSteps=0;
        for (int i=0;i<dailySteps.length-1;i++){
            totalSteps+=dailySteps[i];
        }
        return totalSteps;
    }

    public double averageSteps(int totalSteps){
        if(totalSteps==0){//nts: Use == for equality check, not =
            return 0.0;
        }
        return (double)totalSteps/days; //nts: (double) in front of totalSteps converts...
        // ...the int into a double, hence makeing the result of...
        // ...(double)totalSteps/totalDays a double
    }

}

