/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;
public class Ejercicio4{
    
    public static boolean validarNumero(String numero) {
        return numero.matches("^[0-9]$");
        }
    
    
    public static void main (String [] args) {
        Scanner entrada = new Scanner( System.in);
        System.out.println("Hasta que numero quieres sumar los numeros consecutivos");
        
        int  sumaTotal = 0;
        String cantidadNumeros =  entrada.next();
        
       if(!validarNumero(cantidadNumeros)){
            System.out.println("Recuerda,solo puedes ingresar numeros");
            System.exit(0);
        } 
       
      int cantidadNumeros1 = Integer.parseInt(cantidadNumeros);
        
        for (int i = 0; i < cantidadNumeros1; i++) {
            sumaTotal+= i+1;
        }
        System.out.println("El resultado es " +sumaTotal);
    }
}

