package com.mycompany.charat5;

import java.util.Scanner;

public class Charat5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String palabra;
        String palabrainvertida="";
        System.out.println("Ingresa una palabra y se mostrara a la inversa");
        palabra= leer.nextLine();
        
        for(int i = palabra.length()-1; i>=0; i--){
            palabrainvertida += palabra.charAt(i);
        }
        System.out.println("La palabra invertida es:"+palabrainvertida);
    } 
}