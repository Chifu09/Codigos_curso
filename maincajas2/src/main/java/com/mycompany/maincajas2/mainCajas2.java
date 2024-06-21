package com.mycompany.maincajas2;
import java.util.Scanner;
public class mainCajas2 {
    private int largo;
    private int alto;
    private int ancho;
    
    public void pedirDatos (){
        Scanner batiz = new Scanner (System.in);
        System.out.println("Indique el largo");
        largo = batiz.nextInt();
        System.out.println("Indique el alto");
        alto = batiz.nextInt();
        System.out.println("Indique el ancho");
        ancho = batiz.nextInt ();
    }
    public int calcVolumen (){
        int volumen;
        volumen = largo * alto * ancho;
        return volumen;
    }
    public void desplegar (int volumen){
        System.out.println("El largo es de: " + largo);
        System.out.println("El ancho es de: " + ancho);
        System.out.println("EL alto es de: " + alto);
        System.out.println("El volumen de la cajita es de: " + volumen);
    }
}
