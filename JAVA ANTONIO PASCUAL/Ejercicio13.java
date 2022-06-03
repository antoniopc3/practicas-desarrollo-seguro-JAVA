/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author apcuenca
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] intArray = new double[]{0,4,80,6,1,6,1,5,350};
        
        
        
            
        //media
        double media = 0.0;
        
        for (int i=0; i < intArray.length; i++){
            media = media + intArray[i];
        }
       media = media / intArray.length;
       
       //varianza
       
       double varianza = 0.0;
        for(int i = 0; i < intArray.length; i++){
            double rango;
            rango = Math.pow(intArray[i] - media,2f);
            varianza = varianza + rango;
        }
        varianza =varianza / intArray.length;
       
        //desviacion
        double desviacion = 0.0;
        desviacion =Math.sqrt(varianza);
        
        //valores atipicos
        for(int i=0; i < intArray.length; i++){
            double arriba = intArray[i] - media;
            double abajo = arriba / desviacion;
            if(abajo >=2 || abajo<=-2){
             
                System.out.println("El numero: "+intArray[i]+" tiene un valor atipico alto");
            }
        }
       
       
       System.out.println("La media es: "+media);
       System.out.println("La varianza es: "+varianza);
       System.out.println("La desviacion es: "+desviacion);
    }
    
}
