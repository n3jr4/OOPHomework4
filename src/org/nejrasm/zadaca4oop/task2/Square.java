package org.nejrasm.zadaca4oop.task2;

public class Square extends Shape {
    private final double side;

    protected Square(final String colour, final double side) {
        super(colour);
        this.side = side;
    }

    @Override
    protected final double getArea() {
        return this.side * this.side;
    }

    @Override
    protected final double getCircumference() {
        return 4 * this.side;
    }
}
