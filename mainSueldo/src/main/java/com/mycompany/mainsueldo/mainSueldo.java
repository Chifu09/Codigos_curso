package com.mycompany.mainsueldo;

public class mainSueldo {
    
    public static void main (String[]args){
        
        Sueldo cajita = new Sueldo ();
        
        cajita.pedirDatos();
        cajita.calcularSueldo();
        cajita.desplegar();
    }
    
}