/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author apcuenca
 */

public class Ejercicio14{

public static boolean validarCaracteres(String cadena) {
        return cadena.matches("^[a-z0-9/:.]+$");
        }    
    
public static void main(String[] args) throws IOException{
   Scanner entrada = new Scanner( System.in);
   System.out.println("Dame la URL de la pagina de la cual quieres adivinar su numero total de caracteres");
    String pagina = entrada.next();
    
    if(!validarCaracteres(pagina)){
            System.out.println("Direccion no valida");
            System.exit(0);
        }
    
    FileWriter fichero=null;
    try {
		fichero = new FileWriter("C:/Users/apcuenca/Desktop/descarga.txt");

   

               
         // Se abre la conexión
         URL url = new URL(pagina);
         URLConnection conexion = url.openConnection();
         conexion.connect();
 
         // Lectura
         InputStream is = conexion.getInputStream();
         BufferedReader br = new BufferedReader(new InputStreamReader(is));
   
         char[] buffer = new char[1000];
         int leido;
         while ((leido = br.read(buffer)) > 0)
         
        	//creamos un string explícitamente escribimos
         {
         fichero.write(new String(buffer, 0, leido));
         
         
         }
         
      } catch (IOException e) {
        // TODO Auto-generated catch block

      }
    finally {
    	   if (null!=fichero) fichero.close();
    	}
    
   File file = new File(
            "C:/Users/apcuenca/Desktop/descarga.txt");
        FileInputStream fileInputStream
            = new FileInputStream(file);
        InputStreamReader inputStreamReader
            = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader
            = new BufferedReader(inputStreamReader);
 
        String line;
       
        int characterCount = 0;
       
 
        while ((line = bufferedReader.readLine()) != null) {
            
            
                characterCount += line.length();
                
            
        }
        
        
        System.out.println("Numero total de caracteres de la pagina "+pagina+" "+ characterCount);
       
	}
}

  

