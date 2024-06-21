package com.mycompany.mainproductos;
import java.util.Scanner;
public class comprador {
    Scanner teclitas = new Scanner(System.in);
    private String nombre_cliente;
    private String producto [] = new String[6];
    private int costo[] = new int [6];
    private int suma, menor, mayor;
    
    
    public void pedirDatos() {
        System.out.println("Ingrese un nombre");
        nombre_cliente=teclitas.next();
        
        for (int i=0; i < 6; i++) {
            System.out.println("Ingrese un producto");
            producto[i]=teclitas.nextLine();
            teclitas.nextLine();
            System.out.println("Ingrese el costo del producto");
            costo[i]=teclitas.nextInt();
            
            
        }
    }
    
    public void calcular() {
        //suma
        for (int i=0; i < 6; i++) {
        suma = suma + costo[i];
        }
        
        menor = costo[0];
        for (int i = 0; i < costo.length; i++) {
            if(costo[i] < menor){
                menor= costo[i];
            }
        }
        mayor = costo[0];
        for (int i = 0; i < costo.length; i++) {
            if(costo[i] > mayor){
                mayor= costo[i];
            }
        }
        
        
    }
    
    public void desplegar() {
        
        for (int i=0; i<6; i++){
            System.out.printf("%-40s %5d %n", producto[i], costo[i]);
        }
        
        System.out.println("El nombre del comprador es: "+nombre_cliente);
        System.out.println("La suma de los costos de todos los articulos es: "+suma);
        System.out.println("El costo mayor es: "+mayor);
        System.out.println("El costo menor es: "+menor);
    }
    
}
