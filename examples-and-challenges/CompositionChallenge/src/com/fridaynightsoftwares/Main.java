/*
* Create a single room of a house using composition.
* Think about the things that should be included in the room.
* Maybe physical parts of the house but furniture as well
* Add at least one method to access an object via a getter and
* then that object's public method as you saw in the previous video
* then add at least one method to hide the object e.g. not using a getter
* but to access the object used in composition within the main class
* like you saw in this video.
* */

package com.fridaynightsoftwares;

public class Main {
    public static void main(String[] args) {
        Walls northWall = new Walls(4, "Wood", "Wood color", "North");
        Walls southWall = new Walls(4, "Wood", "Wood color", "South");
        Walls eastWall = new Walls(4, "Wood", "Wood color", "East");
        Walls westWall = new Walls(4, "Wood", "Wood color", "West");
        Floor floor = new Floor(10, 10, "Wood", "Wood color");
        Floor ceiling = new Floor(10, 10, "Wood", "Wood color");
        Bed bed = new Bed(2, 4, 2, 4);
        Shelf shelf = new Shelf(10);
        Wardrobe wardrobe = new Wardrobe(10, 10, 5, 3, 40, 0, 40, 3);
        Door door = new Door(2, 0.3, 0.01, "Wood", "Wood color");
        Bedroom bedroom = new Bedroom(northWall, southWall, eastWall, westWall, floor, ceiling, bed, shelf, wardrobe, door);
        bedroom.makingBed();
        System.out.println(bedroom.getDoor().getHeight());
    }
}
