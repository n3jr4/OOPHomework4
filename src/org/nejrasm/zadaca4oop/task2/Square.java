package org.nejrasm.zadaca4oop.task2;

public class Square extends Shape {
    private final double side;

    public Square(final String colour, final double side) {
        super(colour);
        this.side = side;
    }

    @Override
    public final double getArea() {
        return this.side * this.side;
    }

    @Override
    public final double getCircumference() {
        return 4 * this.side;
    }
}
