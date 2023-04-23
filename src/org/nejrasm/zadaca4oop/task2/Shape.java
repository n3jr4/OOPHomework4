package org.nejrasm.zadaca4oop.task2;

public abstract class Shape {
    private final String colour;

    public Shape(final String colour) {
        this.colour = colour;
    }

    public abstract double getArea();

    public abstract double getCircumference();

    @Override
    public final String toString() {
        return "Colour: {" + this.colour + "}, Area: {" + this.getArea() + "}, Circumference: {" + this.getCircumference() + "}";
    }
}
