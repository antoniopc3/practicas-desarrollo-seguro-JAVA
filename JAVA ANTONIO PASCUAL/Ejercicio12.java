/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;


import java.util.*;

/**
 *
 * @author apcuenca
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        
        System.out.println("Dame un frase, vamos a contar sus palabras");
        String texto = lectura.nextLine();
       
        //texto = texto.replaceAll("[\\.\\,\\(\\)]", "");
        
        String[] palabras = texto.split(" ");
        
        HashMap<String, Integer> mapaDeFrecuencias = new HashMap<>();
       
       
        
        for (String palabra : palabras){
            if(mapaDeFrecuencias.containsKey(palabra)){
                mapaDeFrecuencias.put(palabra, mapaDeFrecuencias.get(palabra) + 1);
            } else {
                mapaDeFrecuencias.put(palabra, 1);
            }
           
       }
       for (HashMap.Entry<String, Integer> entry : mapaDeFrecuencias.entrySet()){
           System.out.printf("Palabra '%s' con frecuencia %d\n", entry.getKey(), entry.getValue());
           if(entry.getValue().equals(Collections.max(mapaDeFrecuencias.values()))){
               System.out.println("La palabra que mas aparece lo hace: "+Collections.max(mapaDeFrecuencias.values())+" y es: "+entry.getKey());
           }
           
       }
       
    }
    
}
