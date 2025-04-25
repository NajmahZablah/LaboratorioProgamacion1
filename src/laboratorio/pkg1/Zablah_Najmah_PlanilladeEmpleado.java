/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio.pkg1;

import java.util.Scanner;

/**
 *
 * @author najma
 */
public class Zablah_Najmah_PlanilladeEmpleado {
     public static void main(String[] args) {
         
         //Las horas laboradas al mes y precio por hora deben ser asignadas por el usuario
         Scanner scanner=new Scanner(System.in).useDelimiter("\\n");
         
         System.out.print("Ingresar el nombre del empleado: ");
         String NombreEmpleado=scanner.next();
         
         System.out.print("Ingresar las horas mensuales trabajadas: ");
         int HoraMensual=scanner.nextInt();
         
         System.out.print("Ingresar la tarifa por hora: ");
         double TarifaHora=scanner.nextDouble();
         
         double SalarioSemanal=(HoraMensual*TarifaHora)/4;
         
         //Salida
         System.out.println("\n****Boleta del Empleado****");
         System.out.println("Nombre del empleado: "+NombreEmpleado);
         System.out.println("Hora de Trabajo Mensual: "+HoraMensual);
         System.out.println("Tarifa por Hora: Lps."+TarifaHora);
         System.out.println("Salario del Empleado Semanal: Lps."+SalarioSemanal);
          
     }      
}
