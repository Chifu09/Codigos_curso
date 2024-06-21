package com.mycompany.sueldo;

import java.util.Scanner;

public class Sueldo {
                private String nombre;
		private String puesto;
		private final int sueldo []= new int[6];
                
                public void pedirDatos(){
			Scanner dato = new Scanner (System.in);
			System.out.println("Teclea su nombre");
                        nombre = dato.nextLine();
                        System.out.println("Teclea el puesto que tiene");
                        puesto = dato.nextLine();
                        
                        for (int i=0; i<6; i++){
                        System.out.println("Teclea el sueldo mensual del " +(i+1)+ " mes");
                        sueldo[i] = dato.nextInt();
                        }
                }        
                public void calcularSueldo(){
                    sueldo[1]=sueldo[0]+sueldo[1];
                    sueldo[0]=0;
                       for (int i=0; i<6; i++){
                           sueldo[0]=sueldo[i]+sueldo[0];
                       }
                }
                public void desplegar(){
                    System.out.println("El nombre es: " +nombre);
                    System.out.println("El puesto que tiene es: "+puesto );
                    System.out.println("El sueldo total es: $"+(sueldo[0]));
                

    }
}