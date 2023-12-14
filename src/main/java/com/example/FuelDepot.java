package com.example;

import java.util.List;

public class FuelDepot {
    /** The robot used to move the filling mechanism */
    private FuelRobot filler;
    private List<FuelTank> tanks;

    /**
     * Constructs a FuelDepot object.
     *
     * @param filler The robot used to move the filling mechanism.
     * @param tanks  The list of fuel tanks.
     */
    public FuelDepot(FuelRobot filler, List<FuelTank> tanks) {
        this.filler = filler;
        this.tanks = tanks;
    }

    // Method to implement for a)
    public int nextTankToFill(int threshold) {
        int indexCounter=0;
        for (FuelTank i: this.tanks) {
            indexCounter++;
            if (i.getFuelLevel()<=threshold) {
                break;
            }
        }
    return indexCounter;
    }

    // Method to implement for b)
    public void moveToLocation(int locIndex) {
        // Your implementation here
    }
}
