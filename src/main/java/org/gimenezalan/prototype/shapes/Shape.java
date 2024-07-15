package org.gimenezalan.prototype.shapes;

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() {}

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    public boolean equals(Object objectTwo) {
        if (!(objectTwo instanceof Shape)) return false;
        Shape shapeTwo = (Shape) objectTwo;
        return shapeTwo.x == x && shapeTwo.y == y && Objects.equals(shapeTwo.color, color);
    }
}
