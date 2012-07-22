package com.zappos.training;

/**
 * Created with IntelliJ IDEA.
 * User: ocx
 * Date: 7/22/12
 * Time: 10:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class SpaceVessel{

    private int capacity = 0;
    private String name = "";
    private int hullIntegrity = 0;

    public int getHullIntegrity() {
        return hullIntegrity;
    }

    public void setHullIntegrity(int hullIntegrity) {
        this.hullIntegrity = hullIntegrity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
