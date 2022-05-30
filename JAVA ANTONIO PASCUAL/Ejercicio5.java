/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author apcuenca
 */
public class Ejercicio5 {

    public static boolean validarNumero(String numero) {
        return numero.matches("^[0-9]$");
        }
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in);
        
        System.out.println("Dime a que numero vas a querer dividir");
        String numero1 = entrada.next();
        
        if(!validarNumero(numero1)){
            System.out.println(numero1+" no es valido");
            System.exit(0);
        }
        System.out.println("Dime que numero va a divir al anterior");
        String numero2 = entrada.next();
    
        if(!validarNumero(numero2)){
          System.out.println(numero2+" no es valido");
            System.exit(0);  
        }   
        
        int numero11 = Integer.parseInt(numero1);
        int numero22 = Integer.parseInt(numero2);
        
        int division = numero11/numero22;
        int resto = numero11%numero22;
        
        String div = String.valueOf(division);
        String rest = String.valueOf(resto);
        
        System.out.println("El resultado es: "+ div +" con un resto de: " + rest);
        
    
    }
}