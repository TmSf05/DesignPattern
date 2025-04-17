
import filesystem.File;
import filesystem.Folder;
import paymentprocessor.GcashGateway;
import paymentprocessor.MayaGateway;
import paymentprocessor.PayPalGateway;
import paymentprocessor.PaymentProcessor;
import paymentprocessor.StripeGateway;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;
import shape.Triangle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class DesignPatternDemo {
    
     public static void main(String[] args) {
        // Inheritance: Shape
        Shape circle = new Circle(5);
        Shape rect = new Rectangle(4, 3);
        Shape triangle = new Triangle(3, 5);
        Shape square = new Square(3);  
        System.out.println("\n==================[ SHAPE ]=======================\n");
        
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rect.calculateArea());
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Square area: " + square.calculateArea());

        System.out.println("\n==============[ E-BANK PAYMENT ]==================\n");
        
        // Composition: Payment
        PaymentProcessor paypal = new PaymentProcessor(new PayPalGateway());
        PaymentProcessor stripe = new PaymentProcessor(new StripeGateway());
        PaymentProcessor gcash = new PaymentProcessor(new GcashGateway());
        PaymentProcessor Maya = new PaymentProcessor(new MayaGateway());
        paypal.processPayment(100);
        stripe.processPayment(200);
        gcash.processPayment(500);
        Maya.processPayment(300);

        System.out.println("\n===============[ FILE SYSTEM ]====================\n");
        
        // Composition: FileSystem
        Folder root = new Folder("root");
        Folder docs = new Folder("documents");
        File resume = new File("resume.pdf", 120);
        File report = new File("report.docx", 300);
        docs.addItem(resume);
        docs.addItem(report);
        root.addItem(docs);
        root.addItem(new File("notes.txt", 80));

        System.out.println("Folder Structure:");
        root.printContents("");
        System.out.println("Total size: " + root.getTotalSize() + "KB");
    }
    
}
