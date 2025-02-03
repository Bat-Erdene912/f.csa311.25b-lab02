package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {
    private Shape shape; 

    public Renderer(Shape shape) {
        this.shape = shape;
    }

    public void render() {
        shape.draw();
        System.out.println("Shape printed\n" + "Its area is " + shape.getArea());
    }
}
