/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Aplicacion {
    public static void main(String[]args) {
      divisibleEntredos8();
       
    }
   public static void Multiplos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num + " es múltiplo de dos.");
        } else {
            System.out.println(num + " no es múltiplo de dos.");
        }
        
        if (num % 3 == 0) {
            System.out.println(num + " es múltiplo de tres.");
        } else {
            System.out.println(num + " no es múltiplo de tres.");
        }
    }
        
     
  public static void leerNumeros(){
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Introduce un número mayor o igual que cero: ");
            numero = scanner.nextInt();
        } while (numero < 0);
        System.out.println("El número introducido es: " + numero);
    }
      public static void NumeroCifras(){
  
   Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean esEnteroPositivo = false;
        
        while (!esEnteroPositivo) {
            System.out.print("Introduce un número entero positivo: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    esEnteroPositivo = true;
                } else {
                    System.out.println("El número debe ser positivo.");
                }
            } else {
                System.out.println("No es un número entero.");
                sc.next(); 
            }
         int cifras = 0;
        
        while (numero != 0) {
            numero /= 10;
            cifras++;
        }
         System.out.println("El número tiene " + cifras + " cifras.");
    }
      
      }
       public static void N1AL100() {
        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(i);
            }
        }
    }
       public static void divisibleEntredos8(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = input.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println(numero + " es divisible entre 2.");
        } else {
            System.out.println(numero + " no es divisible entre 2.");
        }
    }
    
}
