package com.example;

public class StepTracker {
    private int steps;
    private int currentSteps=0;
    private int days=0;
    private int activeDayCounter=0;
    
    public StepTracker(int steps) {
        this.steps=steps;
    }

    public void addDailySteps(int newSteps) {
        days++;
        currentSteps +=newSteps;
        if (newSteps>=10000) {
            activeDayCounter++;
        }
    }

    public int activeDays() {
        return activeDayCounter;
    }

    public double averageSteps() {
        if (days==0) {
            return 0.0;
        } else {
            return currentSteps/(double) days;
        }
    }

}
