
package com.mycompany.multiplo10;
import java.util.Scanner;
public class Multiplo10 {

    public static void main(String[] args) {
        
                
		int contador[]= new int [4];
		float columna=0;
			 
			for (int i = 1; i <= 5; i++){
				for (int j = 1; j <= 5; j++){
					System.out.print(contador + "\t\t");
					contador = contador ++ 10;
					
					columna = contador [0];
       
						for (int i = 1; i < contador.length; i++) {
						columna += contador[i];
						System.out.print(columna + "\t\t");
			
				}
			}
			System.out.println("");	
		}
	}
}


