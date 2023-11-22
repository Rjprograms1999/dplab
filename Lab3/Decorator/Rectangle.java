package Decorator;

public class Rectangle implements Shape {

    private double price = 70.00;

    public void draw() {
        System.out.println("Shape: Rectangle");
        System.out.println("Cost: RS " + computerCost());

    }

    public double computerCost() {
        return price;
    }

}
