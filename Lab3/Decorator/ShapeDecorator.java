
package Decorator;


public abstract class ShapeDecorator implements Shape  {
    protected Shape decoratedShape;
    protected double decoratedCost;

   public ShapeDecorator(Shape decoratedShape, double decoratedCost){
      this.decoratedShape = decoratedShape;
      this.decoratedCost=decoratedCost;
   }

    @Override
  public void draw() {
      
        decoratedShape.draw();
      
        
    }
  
    /**
     *
     * @return
     */
    @Override
  public double computerCost(){
      return decoratedShape.computerCost() + decoratedCost;
      
  }
  
}
