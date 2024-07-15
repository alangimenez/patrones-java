package org.gimenezalan.prototype.shapes.impl;

import org.gimenezalan.prototype.shapes.Shape;

public class CircleShape extends Shape {
    public int radius;

    public CircleShape() {};

    public CircleShape(CircleShape circle) {
        super(circle);
        if (circle != null) {
            this.radius = circle.radius;
        }
    }

    @Override
    public Shape clone() {
        return new CircleShape(this);
    }

    public boolean equals(Object object2) {
        if (!(object2 instanceof CircleShape) || !super.equals(object2)) return false;
        CircleShape shape2 = (CircleShape) object2;
        return shape2.radius == radius;
    }
}
