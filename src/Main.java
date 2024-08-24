import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        StepTracker tr=new StepTracker(10000);
        int stepsForActiveDay = tr.getStepsForActiveDay();

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days have you gone for a walk?");
        int days = scanner.nextInt();
        int[] dailySteps=tr.DailySteps(days);
        int activeDays = tr.activeDays(stepsForActiveDay, dailySteps);
        int totalSteps = tr.addDailySteps(dailySteps);
        double averageSteps=tr.averageSteps(totalSteps);
        System.out.println("Active Days: "+activeDays);
        System.out.println("Average Steps: "+averageSteps);
        scanner.close();
    }
}