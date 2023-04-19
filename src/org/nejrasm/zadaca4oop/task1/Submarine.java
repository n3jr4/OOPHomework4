package org.nejrasm.zadaca4oop.task1;

public class Submarine implements Swim {
    @Override
    public String swim() {
        return new Fish().swim();
    }
}
