package com.mycompany.tocino;

import java.util.Scanner;

public class Tocino {

    public static void main(String[] args) {
        
       
        int numeros[][] = new int[5][4];
         Scanner sc = new Scanner(System.in);
        
        
       
        for (int x = 0; x < numeros.length; x++) {
            for (int y = 0; y < numeros[y].length; y++) {
                 System.out.println("Introducir valores");
              
                   numeros[x][y] = sc.nextInt();
                   }
             }
        
                 System.out.println("valores introducidos:");
                      for (int x = 0; x < numeros.length; x++) { 
                         for (int y = 0; y < numeros[y].length; y++) {
                System.out.print(numeros[x][y] + " ");
               
 }
                          System.out.println(); 
   }              
    }         
        
 }
        
        
        

