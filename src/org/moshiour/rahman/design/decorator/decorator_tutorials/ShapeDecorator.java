package org.moshiour.rahman.design.decorator.decorator_tutorials;

public abstract class ShapeDecorator implements Shape{

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape=decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}

