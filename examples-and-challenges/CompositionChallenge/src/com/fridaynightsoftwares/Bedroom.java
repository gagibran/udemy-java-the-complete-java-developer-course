package com.fridaynightsoftwares;

public class Bedroom {

    // Fields:
    private Walls firstWall;
    private Walls secondWall;
    private Walls thirdWall;
    private Walls fourthWall;
    private Floor floor;
    private Floor ceiling;
    private Bed bed;
    private Shelf shelf;
    private Wardrobe wardrobe;
    private Door door;

    // Constructor:
    public Bedroom(Walls firstWall, Walls secondWall, Walls thirdWall, Walls fourthWall, Floor floor,
                   Floor ceiling, Bed bed, Shelf shelf, Wardrobe wardrobe, Door door) {
        this.firstWall = firstWall;
        this.secondWall = secondWall;
        this.thirdWall = thirdWall;
        this.fourthWall = fourthWall;
        this.floor = floor;
        this.ceiling = ceiling;
        this.bed = bed;
        this.shelf = shelf;
        this.wardrobe = wardrobe;
        this.door = door;
    }

    // Getters:
    public Walls getFirstWall() {
        return firstWall;
    }
    public Walls getSecondWall() {
        return secondWall;
    }
    public Walls getThirdWall() {
        return thirdWall;
    }
    public Walls getFourthWall() {
        return fourthWall;
    }
    public Floor getFloor() {
        return floor;
    }
    public Floor getCeiling() {
        return ceiling;
    }
    public Bed getBed() {
        return bed;
    }
    public Shelf getShelf() {
        return shelf;
    }
    public Wardrobe getWardrobe() {
        return wardrobe;
    }
    public Door getDoor() {
        return door;
    }

    public void makingBed() {
        System.out.println("Making bed...");
        bed.makeBed();
    }
}
