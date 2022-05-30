/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;
/**
 *
 * @author apcuenca
 */
public class Ejercicio9 {

    public static boolean validarBusqueda(String cadena) {
        return cadena.matches("^[A-Za-z!]+$");
        }
   
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in);
        
        
        
        while(true){
            
            System.out.println("¿Que quieres que se muestre?");
            String mostrar1 = entrada.next();
            
            if(!validarBusqueda(mostrar1)){
                System.out.println("Has introducido caracteres no validos");
                System.exit(0);
            }
            
            
            if ("BASTA!".equals(mostrar1)){
                System.out.println("Proceso detenido");
                System.exit(0);
                
                
            System.out.println(mostrar1);
            }
        }
    
    }
}

    
