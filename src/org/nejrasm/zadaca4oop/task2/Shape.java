package org.nejrasm.zadaca4oop.task2;

public abstract class Shape {
    private final String colour;

    protected Shape(final String colour) {
        this.colour = colour;
    }

    protected abstract double getArea();

    protected abstract double getCircumference();

    @Override
    public final String toString() {
        return "Colour: {" + this.colour + "}, Area: {" + this.getArea() + "}, Circumference: {" + this.getCircumference() + "}";
    }
}
