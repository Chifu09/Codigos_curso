package com.mycompany.promedio;
import java.util.Scanner;
public class Promedio {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int [] A = new int [10];
        float suma = 0;
        float cantidad = 0;
        int mayor; 
        int menor;
        System.out.println("Bienvenido");
        for (int i = 0; i < A.length; i++) {
            System.out.println("Inserte un numero");
            A[i] = lector.nextInt();
            suma += A[i];
            cantidad++;
        }
        mayor = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > mayor) {
                mayor = A[i];
            }
        }
        menor = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] < menor) {
                menor = A[i];
            }
        }
        System.out.println("El numero menor es: " +menor);
        System.out.println("El numero mayor es: " +mayor);
        System.out.println("El promedio es de: " + suma/cantidad);
    }
}
