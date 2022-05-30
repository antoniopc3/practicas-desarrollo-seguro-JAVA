/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;
/**
 *
 * @author apcuenca
 */
public class Ejercicio6 {

    
    public static boolean validarCaracteres(String cadena) {
        return cadena.matches("^[0-9]$");
        }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in);
        
        System.out.println("Dime cuantas mascarillas vas a comprar");
        String mascarillas = entrada.next();
        
        if(!validarCaracteres(mascarillas)){
            System.out.println("Recuerda que solo vale escribir numeros");
            System.exit(0);
        }
        
        
        System.out.println("Dime cuantos geles vas a querer");
        String geles = entrada.next();
        
        if(!validarCaracteres(geles)){
            System.out.println("Recuerda que solo vale escribir numeros");
            System.exit(0);
        }   
        
        double gel = Integer.parseInt(geles);
        double masc = Integer.parseInt(mascarillas);
        
        double pesomasc = masc*0.112;
        double pesogel = gel*0.250;
        double total = pesogel+pesomasc;
        
        
        System.out.println("El numero de mascarillas compradas es de: "+mascarillas+" y el numero de geles comprados es de: "+geles+" con peso total de: "+total+" kilos");
        
        }
    }    
