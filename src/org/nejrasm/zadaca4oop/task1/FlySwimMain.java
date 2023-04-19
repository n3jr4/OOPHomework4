package org.nejrasm.zadaca4oop.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FlySwimMain {
    public static void main(String[] args) {
        final Swim fish = new Fish();
        final Swim submarine = new Submarine();
        final Flight plane = new Plane();
        final Flight pegasus = new Pegasus();
        final Duck duck = new Duck();

        final List<Swim> swimingObjects = new LinkedList<>();
        final List<Flight> flyingObjects = new ArrayList<>();
        swimingObjects.add(fish);
        swimingObjects.add(duck);
        swimingObjects.add(submarine);
        flyingObjects.add(duck);
        flyingObjects.add(plane);
        flyingObjects.add(pegasus);

        for (final Swim swim : swimingObjects) {
            System.out.println(swim.swim());
        }
        for (final Flight flight : flyingObjects) {
            System.out.println(flight.fly());
        }
    }
}
