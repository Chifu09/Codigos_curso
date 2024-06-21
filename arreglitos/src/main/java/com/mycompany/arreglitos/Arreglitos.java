package com.mycompany.arreglitos;

import java.util.Scanner;

public class Arreglitos {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        int n;
        
        System.out.println("Bienvenido");
        System.out.println("Inserte un numero");
        n = lector.nextInt();
        
        if (n > 0) {
            
            for (int i = 1; i <= 10; i++) {
                System.out.println(n+ " * " +i+ " = " +n*i);
            }  
            
        } else {
            System.out.println("El numero ingresado no es correcto "
            + "Intentelo nuevamente");
      }
        
         
    }
        
       
}
