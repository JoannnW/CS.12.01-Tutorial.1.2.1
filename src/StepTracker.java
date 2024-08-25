public class StepTracker{
    //properties
    private int minSteps;
    private int activeDays;
    private int steps;
    private int days;
    private int stepsForActiveDay;
    private int totalSteps;
    //constructor
    public StepTracker(int minSteps){
        this.minSteps=minSteps;
        activeDays=0;
        steps=0;
        days=0;
        stepsForActiveDay=0;
        totalSteps=0;
    }
    //get__ methods for each property(3)
    public int getMinSteps(){
        return minSteps;
    }
    public int getActiveDays(){
        return activeDays;
    }
    public int getSteps(){
        return steps;
    }
    public int getDays(){
        return days;
    }
    public int getStepsForActiveDay(){
        return stepsForActiveDay;
    }
    public int getTotalSteps(){
        return steps;
    }

    //Methods
    public void addDailySteps(int steps){
        if (steps>minSteps){
            activeDays++;
        }
        days++;
        this.steps+=steps;
    }
    public int activeDays(){
        return activeDays;
    }
    public double averageSteps(){
        if (days==0){
            return 0.0;
        }
        return (double) steps /days;
    }
}


