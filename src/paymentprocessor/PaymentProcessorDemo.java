/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paymentprocessor;

/**
 *
 * @author user
 */
public class PaymentProcessorDemo {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PaymentProcessor(new PayPalGateway());
        PaymentProcessor stripe = new PaymentProcessor(new StripeGateway());
        PaymentProcessor gcash = new PaymentProcessor(new GcashGateway());
        PaymentProcessor Maya = new PaymentProcessor(new MayaGateway());
        
        System.out.println("\n==============[ E-BANK PAYMENT ]==================\n");
        
        paypal.processPayment(100);
        stripe.processPayment(200);
        gcash.processPayment(500);
        Maya.processPayment(300);
        
        System.out.println("\n==================================================\n");
    }
}
