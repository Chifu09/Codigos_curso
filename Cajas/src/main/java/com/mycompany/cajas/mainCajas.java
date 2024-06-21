package com.mycompany.cajas;
import java.util.Scanner;
public class mainCajas {
    private int largo;
    private int alto;
    private int ancho;
    private int volumen;
    
    public void pedirDatos (){
        Scanner batiz = new Scanner (System.in);
        System.out.println("Indique el largo");
        largo = batiz.nextInt();
        System.out.println("Indique el alto");
        alto = batiz.nextInt ();
        System.out.println("Indique el ancho");
        ancho = batiz.nextInt ();
    }
    public void calcVolumen (){
        volumen = largo * alto * ancho;
    }
    public void desplegar (){
        System.out.println("El volumen de la caja es de: " + volumen);
    }
}