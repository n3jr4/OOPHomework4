package org.nejrasm.zadaca4oop.task1;

public class Duck implements Flight, Swim {
    @Override
    public String fly() {
        return new Pegasus().fly();
    }

    @Override
    public String swim() {
        return "Kinda floats";
    }
}
