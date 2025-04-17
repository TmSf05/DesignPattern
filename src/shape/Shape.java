package shape;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public abstract class Shape {

    /**
     *
     * @return
     */
    //Abstract method for calculate area
    public abstract double calculateArea();
   
    // You can optionally add a method to return shape name
    public String getShapeName() {
        return this.getClass().getSimpleName();
    }
}
