package com.zappos.training;

/**
 * Created with IntelliJ IDEA.
 * User: ocx
 * Date: 7/22/12
 * Time: 10:52 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class SpaceShip extends SpaceVessel {

    private int engineCount = 0;
    private int cargoCapacity = 0;

    public int getEngineCount() {
        return engineCount;
    }

    public void setEngineCount(int engineCount) {
        this.engineCount = engineCount;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public abstract void move();

    public abstract void scan();
}
