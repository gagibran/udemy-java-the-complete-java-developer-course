package com.fridaynightsoftwares;

/*
* Challenge.
* Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
* Finally, create another class, a specific type of Car that inherits from the Car class.
* You should be able to hand steering, changing gears, and moving (speed in other words).
* You will want to decide where to put the appropriate state and behaviours (fields and methods).
* As mentioned above, changing gears, increasing/decreasing speed should be included.
* For you specific type of vehicle you will want to add something specific for that type of car.
* */

public class Main {

    public static void main(String[] args) {
        Car honda = new Car(7, "FHXG667", "Civic",
                    "Honda", "Blue", true, "Gasoline");
        honda.changeSpeed(-20);
        honda.changeSpeed(100);
        honda.changeSpeed(200);
        honda.changeSpeed(23.4);
        honda.changeSpeed(3);
        FlexCar onix = new FlexCar(6, "GGFX563", "Onix",
                        "GM", "White", false);
        System.out.println(onix.getFuel());
        onix.steer(-123.4);
        System.out.println(onix.getCurrentSteerDegrees());

    }
}
