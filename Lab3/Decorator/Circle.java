
package Decorator;


public class Circle implements Shape {
    
    private double price=50.00;
    public void draw() {
      System.out.println("Shape: Circle");
        System.out.println("Cost: RS " +computerCost() );
   }
    
    public double computerCost(){
        return price;
    }
}
