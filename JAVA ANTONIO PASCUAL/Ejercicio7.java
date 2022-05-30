/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;
/**
 *
 * @author apcuenca
 */
public class Ejercicio7 {

    public static boolean validarCaracteres(String cadena) {
        return cadena.matches("^[012468.]+$");
        }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in);
        
        System.out.println("¿Que nota le das al producto? Deber darle una nota de 0, 0.2, 0.4, 0.6, 0.8 o 1, siendo 0 lo mas bajo y 1 lo más alto");
        String nota = entrada.next();
        
        if(!validarCaracteres(nota)){
            System.out.println("Recuerda que solo vale escribir numeros");
            System.exit(0);
        }
        
        double nota1 = Double.parseDouble(nota);
        double multiplicador = 1.5;
        
        if (nota1 == 0){
            System.out.println("La nota del  producto es "+nota+" y un nivel de mal producto");
            System.exit(0);
        }  else if (nota1 == 0.4){
            double notfin = nota1*multiplicador;
            System.out.println("El producto tiene una nota de: "+notfin+" con un nivel aceptable");
        } else if (nota1 == 0.6 || nota1 == 0.8 || nota1 == 1){
            double notfin = nota1*multiplicador;
            System.out.println("El producto tiene una nota de: "+notfin+" con un nivel de reseñable");
        } else if (nota1 == 0.2){
            double notfin = nota1*multiplicador;
            System.out.println("El producto tiene una nota de: "+notfin+" con un nivel aceptable");
        }
      
    }
 }
    
