package com.example;

public class StepTracker {
    private int steps;
    
    public StepTracker(int steps) {
        this.steps=steps;
    }

    public int addDailySteps(int newSteps) {
        steps +=newSteps;
        if (steps>=10000) {
            return steps;
        } else {
            return (Integer) null;
        }
    }

    public int activeDays() {
        int activeDayCounter=0;
        if ()
        return activeDayCounter;
    }

    public double averageSteps() {
        
    }

}
