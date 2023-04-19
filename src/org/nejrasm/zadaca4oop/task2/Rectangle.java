package org.nejrasm.zadaca4oop.task2;

public class Rectangle extends Shape {
    private final double a;
    private final double b;

    public Rectangle(final String colour, final double a, final double b) {
        super(colour);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return this.a * this.b;
    }

    @Override
    public double getCircumference() {
        return 2 * (this.a + this.b);
    }
}
