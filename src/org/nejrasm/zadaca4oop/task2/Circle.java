package org.nejrasm.zadaca4oop.task2;

public class Circle extends Shape {
    private final double radius;

    public Circle(final String colour, final double radius) {
        super(colour);
        this.radius = radius;
    }

    @Override
    protected double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    protected double getCircumference() {
        return 2 * this.radius * Math.PI;
    }
}
