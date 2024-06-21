package com.mycompany.maineje6;
import java.util.Scanner;
public class Carro {
    private String Placa,Marca,Origen,NombreCliente;
    private final int pagos[]= new int[6];
    int paso=1;
    private int Origenentrada,pagoshechos,reembolsoporcentaje;
    private float reembolsofinal;

    public void Datos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese placa:");
        Placa = leer.next();
        System.out.println("Ingrese marca:");
        Marca = leer.next();
        do{
        System.out.println("Origen:\n1.Alemania\n2.Japon\3.Italia\n4.USA");
        Origenentrada = leer.nextInt();
        switch (Origenentrada) {
            case 1:
                Origen="Alemania";
                paso=0;
                break;
            case 2:
                Origen="Japon";
                paso=0;
                break;
            case 3:
                Origen="Italia";
                paso=0;
                break;
            case 4:
                Origen="USA";
                paso=0;
                break;
        
            default:
                break;
        }
        }while(paso==1);
        System.out.println("Nombre del Cliente:");
        NombreCliente = leer.next();
        for (int i = 0; i < pagos.length; i++) {
            int r = i+1;
            System.out.println("Pago numero "+r);
            pagos[i]= leer.nextInt();
        }
        this.Pagototal();  
    }


    public void MDatos(){
    System.out.println("Datos del Vehiculo:\nPlaca: "+Placa+"\nMarca: "+Marca+"\nOrigen: "+Origen+
    "\nNombre del cliente: "+NombreCliente);
    System.out.println("El total de pagos hechos es de:"+pagoshechos+"\nEl reembolso seria del "+reembolsoporcentaje+" % por lo cual quedaria en: "+reembolsofinal);
    }


    public void Pagototal(){
        for (int i=0;i<pagos.length;i++){
            pagoshechos+=pagos[i];
        }
        this.reembolso();
    }
    public void reembolso(){
        
        switch (Origen) {
            case "Alemania":
                reembolsoporcentaje=20;
                reembolsofinal= (float) (pagoshechos*.80);
                break;
            case "Japon":
                reembolsoporcentaje=30;
                reembolsofinal= (float) (pagoshechos*.70);
                break;
            case "Italia":
                reembolsoporcentaje=15;
                reembolsofinal= (float) (pagoshechos*.85);
                break;
            case "USA":
                reembolsoporcentaje=8;
                reembolsofinal= (float) (pagoshechos*.92);
                break;

            default:
                break;
        }
        this.MDatos();
    } 

}