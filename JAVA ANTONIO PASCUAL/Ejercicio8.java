/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;
/**
 *
 * @author apcuenca
 */
public class Ejercicio8 {

   
    public static boolean validarBusqueda(String cadena) {
        return cadena.matches("^[A-Za-z]${1}");
        }
    
    public static boolean validarFrase(String cadena) {
        return cadena.matches("^[A-Za-z\\s+]+$");
        }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in);
        
        System.out.println("Introduce una frase, vamos a contar los caracteres sin los espacios y vamos a contar cuantas veces aparece una letra en concreto");
        String frase = entrada.nextLine();
        
        if(!validarFrase(frase)){
            System.out.println("Solo son validas letras");
            System.exit(0);
        }
        
        System.out.println("Que letra quieres buscar");
        String letra =entrada.next();
        char letra1 = letra.charAt(0);
        
        if(!validarBusqueda(letra)){
            System.out.println("Solo puedes buscar letras");
            System.exit(0);
        }
        
        String[] palabras = frase.split(" ");
        
        
        
     //esto mide cuantas palabras hay en el array, a este le debemos restar uno para obtener el numero de espacios para luego calcular el numero de caracteres totales
        int numpalabras = palabras.length;
        int numespacios = numpalabras - 1;
        int numcaracteres = frase.length();
        int caracsinespa = numcaracteres - numespacios;
        
        
     
        
        //con esto contamos las veces que aparece la letra
        int total = 0;
        for(int i = 0; i < frase.length(); i++){
            
            char temp = frase.charAt(i);
            if (temp == letra1)
                total++;
        }
        
        
        System.out.println("El  numero de caracteres sin contar los espacios es: "+caracsinespa+" y la letra que buscas aparece: "+total);
        }
    }
    

