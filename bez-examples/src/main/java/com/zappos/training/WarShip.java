package com.zappos.training;

/**
 * Created with IntelliJ IDEA.
 * User: ocx
 * Date: 7/22/12
 * Time: 11:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class WarShip extends SpaceShip implements Interstellar {

    private int laserCount = 0;
    private int torpedoCount = 0;

    public WarShip(){

    }

    public WarShip(String name, int engineCount, int cargoCapacity, int capacity, int hullIntegrity){
        this.setName(name);
        this.setEngineCount(engineCount);
        this.setCargoCapacity(cargoCapacity);
        this.setCapacity(capacity);
        this.setHullIntegrity(hullIntegrity);
    }

    public int getLaserCount() {
        return laserCount;
    }

    public void setLaserCount(int laserCount) {
        this.laserCount = laserCount;
    }

    public int getTorpedoCount() {
        return torpedoCount;
    }

    public void setTorpedoCount(int torpedoCount) {
        this.torpedoCount = torpedoCount;
    }

    public void warp(int factor) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void move() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void scan() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void fireAll(){

    }

    public void fireLasers(){

    }

    public void fireTorpedos(){

    }
}
