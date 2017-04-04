/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s05invoiceapp;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class S05invoiceapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Bienvenido a la aplicacion total factura");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese subtotal :    ");
        double subtotal = sc.nextDouble();
        double impuesto = subtotal * 0.18;
        double total = subtotal + impuesto;
        
        String mensaje = "Total Factura:     " + total + "\n";
        System.out.println(mensaje);
    }
    
}
