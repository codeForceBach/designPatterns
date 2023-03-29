package main.java.builderStratagy;

import java.awt.*;

public class BedroomBuilder implements Builder{
    //simply paste all the instance variables from Bedroom class
    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;

    public BedroomBuilder(){
    }

    @Override
    public BedroomBuilder setDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
        System.out.println("bedroom dimension - Height: " + dimensions.getHeight() + ", Width : " + dimensions.getWidth());
        return this;
    }

        @Override
    public BedroomBuilder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        System.out.println("bedroom Ceiling height is : " + ceilingHeight + "ft");
        return this;
    }

    @Override
    public BedroomBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    @Override
    public BedroomBuilder setWallColor(Color wallColor) {
        this.wallColor = wallColor;
        System.out.println("bedroom wall color is : " + wallColor);
        return this;
    }

    @Override
    public BedroomBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        System.out.println("bedroom number of windows are : " + numberOfWindows);
        return this;
    }

    @Override
    public BedroomBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        System.out.println("bedroom number of doors are : " + numberOfDoors);
        return this;
    }

    public BedroomBuilder setDouble(boolean aDouble) {
        isDouble = aDouble;
        System.out.println("bedroom is double? : " + isDouble);
        return this;
    }

    public BedroomBuilder setHasEnsuite(boolean hasEnsuite) {
        this.hasEnsuite = hasEnsuite;
        System.out.println("bedroom has ensuite? : " + hasEnsuite);
        return this;
    }

    public Bedroom createRoom(){
        return new Bedroom(dimensions, ceilingHeight, floorNumber, wallColor, numberOfDoors, numberOfWindows, isDouble, hasEnsuite);
    }
}
