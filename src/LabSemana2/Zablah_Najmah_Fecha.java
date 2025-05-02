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
public class Zablah_Najmah_Fecha {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
        //Recordatorio
        System.out.println("****Recordatorio****");
        System.out.println("Los meses deben tener menos de 30 días");
        
        //Leer primera fecha
        System.out.print("\nPor favor, ingrese la primera fecha en formato Dia/Mes/Año: ");
        String fecha1=lea.next();
        
        //Leer segunda fecha
        System.out.print("Por favor, escribir la segunda fecha en formato Dia/Mes/Año: ");
        String fecha2=lea.next();
        

        int dia1=Integer.parseInt(fecha1.substring(0,2));
        int mes1=Integer.parseInt(fecha1.substring(3,5));
        int ano1=Integer.parseInt(fecha1.substring(6));
        
        int dia2=Integer.parseInt(fecha2.substring(0,2));
        int mes2=Integer.parseInt(fecha2.substring(3,5));
        int ano2=Integer.parseInt(fecha2.substring(6));
        
        int totalDias1=ano1*360+mes1*30+dia1;
        int totalDias2=ano2*360+mes2*30+dia2;
        
        int diferencia=Math.abs(totalDias1-totalDias2);
        
        System.out.println("\n****Resultado****");
        System.out.println("La diferencia entre las dos fechas es de "+ diferencia+ " días");
    }
}
