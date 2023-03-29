package main.java.builderStratagy;

import java.awt.*;

public class KitchenBuilder implements Builder{
    //simply paste all the instance variables from Bedroom class
    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean hasDishwasher;
    private boolean hasMicrowave;

    public KitchenBuilder(){
    }

    @Override
    public KitchenBuilder setDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
        System.out.println("kitchen dimension - Height: " + dimensions.getHeight() + ", Width : " + dimensions.getWidth());
        return this;
    }

    @Override
    public KitchenBuilder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        System.out.println("kitchen Ceiling height is : " + ceilingHeight + "ft");
        return this;
    }

    @Override
    public KitchenBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        System.out.println("kitchen is located in : " + wallColor + "floor.");
        return this;
    }

    @Override
    public KitchenBuilder setWallColor(Color wallColor) {
        this.wallColor = wallColor;
        System.out.println("kitchen wall color is : " + wallColor);
        return this;
    }

    @Override
    public KitchenBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        System.out.println("kitchen number of windows are : " + numberOfWindows);
        return this;
    }

    @Override
    public KitchenBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        System.out.println("kitchen number of doors are : " + numberOfDoors);
        return this;
    }

    public KitchenBuilder setDishwasher(boolean hasDishwasher) {
        this.hasDishwasher = hasDishwasher;
        System.out.println("kitchen is hasDishwasher? : " + hasDishwasher);
        return this;
    }

    public KitchenBuilder setMicrowave(boolean hasMicrowave) {
        this.hasMicrowave = hasMicrowave;
        System.out.println("kitchen has Microwave? : " + hasMicrowave);
        return this;
    }
    public Kitchen createKitchen(){
        return new Kitchen(dimensions, ceilingHeight, floorNumber, wallColor, numberOfDoors, numberOfWindows, hasDishwasher, hasMicrowave);
    }
}
