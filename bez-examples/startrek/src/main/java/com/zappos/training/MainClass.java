package com.zappos.training;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ocx
 * Date: 7/21/12
 * Time: 10:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {

    public static void main(String[] args){
        //Lets create a few warships
        WarShip prometheus = new WarShip("Prometheus", 4, 45000, 100, 100);
        WarShip defiant = new WarShip("Defiant", 2, 15000, 50, 100);
        WarShip hathaway = new WarShip("Hathaway", 2, 60000, 500, 100);

        //Now lets add them to a collection
        List<WarShip> theFleet = new ArrayList<WarShip>();
        theFleet.add(prometheus);
        theFleet.add(defiant);
        theFleet.add(hathaway);



    }
}
