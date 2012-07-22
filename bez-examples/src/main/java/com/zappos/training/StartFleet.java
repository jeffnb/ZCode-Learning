package com.zappos.training;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ocx
 * Date: 7/22/12
 * Time: 11:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class StartFleet {
    private static StartFleet ourInstance = new StartFleet();

    private List<Interstellar> fleet = new ArrayList<Interstellar>();

    public static StartFleet getInstance() {
        return ourInstance;
    }

    private StartFleet() {
    }

    public List<Interstellar> getFleet() {
        return fleet;
    }

    public void setFleet(List<Interstellar> fleet) {
        this.fleet = fleet;
    }

    public void addShipToFleet(Interstellar ship){
        fleet.add(ship);
    }

    public void removeShipFromFleet(Interstellar ship){
        fleet.remove(ship);
    }
}
