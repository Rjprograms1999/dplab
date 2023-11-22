package Decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape, double decoratedCost) {
        super(decoratedShape, decoratedCost);

    }

    public void draw() {
        super.decoratedShape.draw();
        System.out.println("Decoration cost with color: RS " + super.computerCost());
        setRedBorder(decoratedShape);

    }

    public void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
