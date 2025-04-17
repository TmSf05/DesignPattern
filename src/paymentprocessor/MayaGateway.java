/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paymentprocessor;

/**
 *
 * @author User
 */
public class MayaGateway implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Maya");
    }
}
