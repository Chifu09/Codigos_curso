package com.mycompany.cajas2;
public class Cajas2 {
    public static void main(String[] args) {
    
    int volumen;
    maincajas2 objCajas = new maincajas2 ();
    objCajas.pedirDatos ();
    objCajas.calcVolumen();
    volumen = objCajas.calcVolumen();
    objCajas.desplegar(volumen);
    }   
}
