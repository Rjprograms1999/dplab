/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle(), 10.00);

        Shape redRectangle = new RedShapeDecorator(new Rectangle(), 15.00);
        Shape redCircleThickBorder = new RedShapeDecorator(new ThickBorderDecorator(new Circle(),4.00),5.00);
        Shape redRectangleThickBorder = new ThickBorderDecorator(new Rectangle(), 4.00);

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

     System.out.println("Circle with both red border and thick border");
      redCircleThickBorder.draw();
        
        
    }
}
