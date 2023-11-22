/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author DELL
 */
public class ThickBorderDecorator extends ShapeDecorator{
    
     public ThickBorderDecorator(Shape decoratedShape, double decoratedCost) {
      super(decoratedShape, decoratedCost);
     
   }
     @Override
      public void draw() {
          decoratedShape.draw();
     setThickBorder(decoratedShape);
         System.out.println("Decoration cost wuth border: RS " +super.computerCost());

    }
         private void setThickBorder(Shape decoratedShape){
      System.out.println("Border Type: Thick");
      
   }
}
