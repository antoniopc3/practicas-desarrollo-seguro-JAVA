/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;
import java.util.*;
/**
 *
 * @author apcuenca
 */
public class Ejercicio2 {

    
    
 public static boolean validarNumero(String numero) {
        return numero.matches("[0-9]\\d{8}");
    }
 public static boolean validarExtension(String extension) {
        return extension.matches("[0-9]\\d{3}");
    }
 
 public static boolean validarPrefijo(String prefijo){
        return prefijo.matches("[0-9]\\d{1}");
 }
    public static void main(String[] args) {

Scanner lectura = new Scanner (System.in);

System.out.println("Ingrese el prefijo del telefono, por ejemplo '34' ");

String prefijo = lectura.next();

String prefijo2 = "+"+prefijo;

System.out.println("Dime el numero de telefono,recuerda que debe ser de 9 cifras");

String telefono = lectura.next();

String comunidad = telefono.substring(0,3);

System.out.println("Dime la extension del telefono");

String extension = lectura.next();

if (!validarNumero(telefono)){
   System.out.println("Numero no valido");
   System.exit(0);
}

if(!validarExtension(extension)){
    System.out.println("Extension no valida");
    System.exit(0);
}

if(!validarPrefijo(prefijo)){
    System.out.println("Prefijo no valido");
    System.exit(0);
}
String completo=(prefijo2+"-"+telefono+"-"+extension);

//System.out.println(telefono.substring(0,3));
int com =  Integer.parseInt(comunidad);

switch(com){
    case 911:case 912:case 913:case 914:case 915:case 916:case 917:case 918:
        System.out.println("Este numero pertenece a Madrid");
        break;
    case 950:case 951:case 952:case 953:case 954:case 955:case 956:case 957:case 958:case 959:
        System.out.println("Este numero pertenece a Andalucia");
        break;
    case 974:case 976:case 978:
        System.out.println("Este numero pertenece a Aragon");
        break;
    case 984:case 985:
        System.out.println("Este numero pertenece a Asturias");
        break;
    case 871:
        System.out.println("Este numero pertenece a Baleares");
        break;
    case 922:case 928:
        System.out.println("Este numero pertenece a Canarias");
        break;
    case 942:
        System.out.println("Este numero pertenece a Cantabria");
        break;
    case 925:case 926:case 949:case 967:case 969:
        System.out.println("Este numero pertenece a Castilla-La Mancha");
        break;
    case 921:case 923:case 947:case 975:case 979:case 980:case 983:case 987:
        System.out.println("Este numero pertenece a Castilla y Leon");
        break;
    case 931:case 937:case 972:case 973:case 977:
        System.out.println("Este numero pertenece a Cataluña");
        break;
    case 924:case 927:
        System.out.println("Este numero pertenece a Extremadura");
        break;
    case 981:case 982:case 986:case 988:
        System.out.println("Este numero pertenece a Galicia");
        break;
    case 941:
        System.out.println("Este numero pertenece a La Rioja");
        break;
    case 968:
        System.out.println("Este numero pertenece a Murcia");
        break;
    case 948:
        System.out.println("Este numero pertenece a Navarra");
        break;
    case 943:case 945:
        System.out.println("Este numero pertenece a Pais Vasco");
        break;
    case 960:case 965:case 966:
        System.out.println("Este numero pertenece a la Comunidad Valenciana");
        break;
}



System.out.println(completo);
        
    }
    
}
