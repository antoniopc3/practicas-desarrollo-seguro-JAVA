/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author apcuenca
 */


public class Ejercicio3 {

    
    
    public static boolean validarNombre(String nombre) {
        return nombre.matches("[a-zA-Z]");
    }
    
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Dime que animales  hay en el zoo,recuerda que van separados por asteriscos'*'");
        String animales = lectura.next();
        
    if(!validarNombre(animales)){
    System.out.println("Animal o animales no valido");
    System.exit(0);
}
       
        String animalesSeparados[] = animales.split("\\*");
        
        for(String separados:animalesSeparados){
            System.out.println(separados);
        }
    }
    
}