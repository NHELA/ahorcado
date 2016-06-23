/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author Nela
 */
public class PROYECTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int n;
      Scanner var = new Scanner (System.in);
       System.out.println("1. facil");
       System.out.println("2. medio");
       System.out.println("3. dificil");
        System.out.print("\nEscoge la opcion del menú");
        
        n = var.nextInt();
        
        
        
        switch(n){
        
        case 1:
        System.out.println("opcion facil");
     
        case 2:
        System.out.println("opcion medio");
        case 3:
        System.out.println("opcion dificil");
        break;
    }
       
    }
    
}
