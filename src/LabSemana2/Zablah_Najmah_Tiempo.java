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
public class Zablah_Najmah_Tiempo {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
        
        System.out.print("Por favor, ingrese un numero aleatorio de segundos: ");
        int segundos=lea.nextInt();
        
       if (segundos<=0) {
          System.out.println("No se permite ese valor");
       }else{ 
           //Variables
           int horas=0;
           int minutos=0;
           int segundosSobrantes=0;
           
           //Procedimiento
           horas=(segundos/3600);
           minutos=((segundos%3600)/60);
           segundosSobrantes=(segundos/60);
           
           //Salida
           System.out.println("****\nConvesriones****");
           System.out.println("en horas son: "+horas);
           System.out.println("en minutos son: "+minutos);
           System.out.println("en segundos"+segundos);
    }
}
}
