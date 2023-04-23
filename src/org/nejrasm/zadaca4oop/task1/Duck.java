package org.nejrasm.zadaca4oop.task1;

public class Duck implements Flight, Swim {

    private Flight flyingBehavior;

    public Duck() {
        flyingBehavior = new FlyWithWings();
    }

    @Override
    public String fly() {
        return flyingBehavior.fly();
    }

    @Override
    public String swim() {
        return "Kinda floats";
    }
}
