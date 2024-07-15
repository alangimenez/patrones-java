package org.gimenezalan.prototype.shapes.impl;

import org.gimenezalan.prototype.shapes.Shape;

public class RectangleShape extends Shape {
    public int height;
    public int width;

    public RectangleShape() {}

    public RectangleShape(RectangleShape rectangle) {
        super(rectangle);
        if (rectangle != null) {
            this.height = rectangle.height;
            this.width = rectangle.width;
        }
    }

    @Override
    public Shape clone() {
        return new RectangleShape(this);
    }

    public boolean equals(Object object2) {
        if (!(object2 instanceof RectangleShape) || !super.equals(object2)) return false;
        RectangleShape shape2 = (RectangleShape) object2;
        return shape2.width == width && shape2.height == height;
    }
}
