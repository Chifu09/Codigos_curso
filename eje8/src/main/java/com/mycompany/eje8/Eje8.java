
package com.mycompany.eje8;


public class Eje8 {

    
    public static void main(String[] args) {
        
        int adicion = 0;
        int adicionfil = 0;
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
               adicion = adicion + 1;
                System.out.print(adicion + "\t");
                adicionfil = adicionfil + adicion;
            }
            System.out.println(adicionfil);
            adicionfil = 0;
            System.out.println("\n");
        }
        
    }
}
