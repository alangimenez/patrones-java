package org.gimenezalan.prototype;

import org.gimenezalan.prototype.shapes.Shape;
import org.gimenezalan.prototype.shapes.impl.CircleShape;
import org.gimenezalan.prototype.shapes.impl.RectangleShape;

import java.util.ArrayList;
import java.util.List;

public class PrototypeMain {
    public void executePrototypeMain() {
        List<Shape> originalShapes = new ArrayList<>();
        List<Shape> clonedShapes = new ArrayList<>();

        CircleShape circle = new CircleShape();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        originalShapes.add(circle);

        CircleShape anotherCircle = (CircleShape) circle.clone();
        originalShapes.add(anotherCircle);

        RectangleShape rectangle = new RectangleShape();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        originalShapes.add(rectangle);

        cloneAndCompare(originalShapes, clonedShapes);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
