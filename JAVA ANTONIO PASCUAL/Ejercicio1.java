/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;
import java.util.*;
/**
 *
 * @author apcuenca
 */
public class  Ejercicio1{

  public static boolean validarNombre(String nombre) {
        return nombre.matches("[a-zA-Z]");
    }

public static void main (String[] args){

Scanner lectura = new Scanner (System.in);

System.out.println("Ingrese su nombre: ");

String nombre = lectura.next();

System.out.println("Ingrese su primer apellido: ");

String apellido1 = lectura.next();

System.out.println("Ingrese su segundo apellido");

String apellido2 = lectura.next();

if (!validarNombre(nombre)){
    System.out.println("Nombre invalido");
    System.exit(0);
} else if (!validarNombre(apellido1)){
    System.out.println("Primer apellido invalido");
    System.exit(0);
} else if (!validarNombre(apellido2)){
    System.out.println("Segundo apellido invalido");
    System.exit(0);
}

String nombrecomple =  nombre + " " + apellido1 + " " + apellido2;

System.out.println(nombrecomple.toUpperCase());


System.out.println(nombrecomple.toLowerCase());

StringTokenizer stPalabras = new StringTokenizer(nombrecomple);

while (stPalabras.hasMoreTokens()) {
  String sPalabra = stPalabras.nextToken();
  System.out.println(sPalabra.substring(0,1));
}
//System.out.println("Su nombre es: " + nombre + " " + apellido1 + " " + apellido2);

}//cierra método main

}//cierra class

