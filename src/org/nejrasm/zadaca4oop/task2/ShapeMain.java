package org.nejrasm.zadaca4oop.task2;

import java.util.ArrayList;
import java.util.List;

public class ShapeMain {
    public static void main(String[] args) {
        final Shape circle = new Circle("blue", 5);
        final Shape square = new Square("red", 1);
        final Shape rectangle = new Rectangle("yellow", 1, 2);

        final List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(square);
        shapeList.add(rectangle);

        for (final Shape shape : shapeList) {
            System.out.println(shape.toString());
        }
    }
}
