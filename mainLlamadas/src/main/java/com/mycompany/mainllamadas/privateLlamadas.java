package com.mycompany.mainllamadas;

import java.util.Scanner;
public class privateLlamadas {
    
    private String nombre;
    private float pago_locales;
    private float pago_nacionales;
    private float pago_internacionales;
    
    public void pedirNombre(){
        Scanner dato = new Scanner(System.in);
        System.out.println("Teclee su nombre");
        nombre = dato.nextLine();
       }
    
    public void calcular(){
        int n = 0, m = 0; 
        char l ='s';
        Scanner dato = new Scanner(System.in);
        while (l == 's'|| l == 'S'){
        System.out.println("Llamadas de Mexico");
        System.out.println("1 Local");
        System.out.println("2 Nacional");
        System.out.println("3 Internacional");
        System.out.println("4 Salir");
        System.out.println("Tecle la opcion deseada");
        n = dato.nextInt();
        
        if(n > 0 && n < 5){
            System.out.println("Teclee la duracion");
            m = dato.nextInt();
            if (n==1)
               pago_locales = (float) (pago_locales+(m*0.20));
            else
               if(n==2)
               pago_nacionales = (float) (pago_nacionales+(m*0.50));
               else 
               pago_internacionales=(float) (pago_internacionales+(m*0.80));
        }
        else
            System.out.println("Usted salio");
            System.out.println("Mas llamadas teclee S");
            l = dato.next().charAt(0);
        }
       }
    public void desplegar(){
            System.out.println("Su nombre es:"+nombre);
            System.out.println("Total a Pagar de llamadas Locales es: $"+pago_locales);
            System.out.println("Total a Pagar de llamadas Nacionales es: $"+pago_nacionales);
            System.out.println("Total a Pagar de llamadas Internacionales es: $"+pago_internacionales);
            System.out.println("Total a Pagar es: $"+(pago_locales+pago_nacionales+pago_internacionales));
        
       }
    }
