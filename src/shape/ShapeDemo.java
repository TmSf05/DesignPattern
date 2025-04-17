/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author user
 */
public class ShapeDemo {
    
    public static void main(String[] args) { 
        
 /*       //For abstract class
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 3),
            new Triangle (3, 5),
            new Square (3),
        };
        for (Shape shape : shapes){
            System.out.println(shape.getShapeName() + " area: " + shape.calculateArea());

        }
*/
        //for simple code
        Shape circle = new Circle(5);
        Shape rect = new Rectangle(4, 3);
        Shape triangle = new Triangle(3, 5);
        Shape square = new Square(3);
       
        System.out.println("\n==================[ SHAPE ]=======================\n");
        
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rect.calculateArea());
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Square area: " + square.calculateArea());
  
        System.out.println("\n==================================================\n");
    }
}

