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
public class StarFleet {
    private static StarFleet ourInstance = new StarFleet();

    private List<Interstellar> fleet = new ArrayList<Interstellar>();

    public static StarFleet getInstance() {
        return ourInstance;
    }

    private StarFleet() {
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

    //Warp all the ships
    public void warp(){

        //Wait a moment for them to get ready
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(Interstellar ship : fleet){
            ship.warp(9);
        }
    }
}
