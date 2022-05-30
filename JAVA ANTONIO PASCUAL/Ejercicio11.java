/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;
/**
 *
 * @author apcuenca
 */
public class Ejercicio11 {

    
    public static boolean validarFactura(String cadena) {
        return cadena.matches("^[0-9.]+$");
        }
    
    public static boolean validarIva(String cadena) {
        return cadena.matches("^[0-9]+$");
        }
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in);
        
        System.out.println("Dime el total de la factura");
        String factura = entrada.next();
        
        
        if(!validarFactura(factura)){
            System.out.println("Has introducido caracteres no validos");
            System.exit(0);
        }
        
        double factura1 = Double.parseDouble(factura);
        
        System.out.println("Dime el porcentaje de IVA");
        String iva = entrada.next();
        
        
        
        if(!validarIva(iva)){
            System.out.println("Has introducido caracteres no validos");
            System.exit(0);
        }
        
        double iva1 = Double.parseDouble(iva);
        
        double porcen = factura1/100;
        
        double totiva = iva1 * porcen;
        
        double total = factura1 + totiva;
        
        System.out.println("El total de la factura es: "+total+" y lo que representa el iva sobre el total es: "+totiva);
    }
    
}
