package main.java.builderStratagy;

import java.awt.*;

public class Architect {
    public static void main(String[] args){
        //Bedroom room = new Bedroom(new Dimension(200, 100), 132, 2, Color.yellow, 2, 1, true, true);

        //Step 1 - instantiate bedroom object with bedroomBuilder with all the required parameters
        Bedroom livingRoom = new BedroomBuilder().setDimensions(new Dimension(200, 100)).setCeilingHeight(9).setFloorNumber(2).setWallColor(Color.WHITE).setNumberOfWindows(3).setNumberOfDoors(1).setDouble(true).setHasEnsuite(true).createRoom();
        Kitchen kitchen = new KitchenBuilder().setDimensions(new Dimension(300, 250)).createKitchen();

    }
}
