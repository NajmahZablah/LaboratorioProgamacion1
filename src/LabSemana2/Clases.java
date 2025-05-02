/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSemana2;

import java.util.Scanner;

/**
 *
 * @author najma
 */
public class Clases {
    public static void main(String[] args) { 
        Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
        
        /*Variables
        int dia=0, int mes=0
        */
           
        System.out.println("Por favor, ingrese el # dia: ");
        int dia=lea.nextInt();
        System.out.println("Por favor ingrese el # del mes: ");
        int mes=lea.nextInt();
        
        if (mes>12) {
          System.out.println("Se produjo un error, numero NO valido");  
        
        }
               
    }
}
