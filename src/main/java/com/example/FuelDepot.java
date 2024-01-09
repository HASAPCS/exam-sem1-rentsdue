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
        int minTankIndex = this.filler.getCurrentIndex();
        for (int i = 0; i < this.tanks.size(); i++) {
            if (this.tanks.get(i).getFuelLevel() <= threshold && this.tanks.get(i).getFuelLevel() < this.tanks.get(minTankIndex).getFuelLevel()) {
            minTankIndex = i;
            }
        }
        return minTankIndex;
    }

    // Method to implement for b)
    public void moveToLocation(int locIndex) {
        int currentLoc = filler.getCurrentIndex();
        boolean isRight = filler.isFacingRight();
        int moves=Math.abs(locIndex - currentLoc);
        
        if (locIndex > currentLoc && !isRight) {
            filler.changeDirection();
        } else if (locIndex < currentLoc && isRight) {
            filler.changeDirection();
        }

        filler.moveForward(moves);
    }
}
