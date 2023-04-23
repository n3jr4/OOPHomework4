package org.nejrasm.zadaca4oop.task1;

public class Pegasus implements Flight {

    private Flight flyingBehavior;

    public Pegasus() {
        flyingBehavior = new FlyWithWings();
    }

    @Override
    public String fly() {
        return flyingBehavior.fly();
    }
}
