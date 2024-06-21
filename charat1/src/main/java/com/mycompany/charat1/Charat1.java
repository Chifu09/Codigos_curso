package com.mycompany.charat1;
import java.util.Scanner;
public class Charat1 {
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
     
     int aaas = 0, eees =0, iiis = 0, ooos = 0, uuus = 0;
     String palabra;
        System.out.println("Escribe algo");
        palabra=leer.next();
     String cadena = palabra;
     int cuantos = cadena.length();
     for (int j = 0; j < cuantos; j++){
         System.out.println(cadena.charAt(j));
         if(cadena.charAt(j)=='a')
             ++aaas;
         else
             if(cadena.charAt(j)=='e')
             ++eees;
         else
              if(cadena.charAt(j)=='i')
             ++iiis; 
         else
             if(cadena.charAt(j)=='o')
              ++ooos;
         else
             if(cadena.charAt(j)=='u')
             ++uuus; 
     }
        System.out.println("as son:"+aaas);
        System.out.println("es son:"+eees);
        System.out.println("is son:"+iiis);
        System.out.println("os son:"+ooos);
        System.out.println("us son:"+uuus);
    }   
}