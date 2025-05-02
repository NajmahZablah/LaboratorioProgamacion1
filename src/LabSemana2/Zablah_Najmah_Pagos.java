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
public class Zablah_Najmah_Pagos {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
        
        //Variables
        int horasExtras=0; int horasNormales=0; double pagoNormal=35.99; double pagoHorasExtras=0; double pagoTotal=0; int categoria=4;
       
        //Información personal del trabajador
        System.out.println("****Datos del empleado****");
        System.out.print("Codigo del empleado: ");
        int codigo=lea.nextInt();
        System.out.print("Nombre completo del trabajador: ");
        String nombreCompleto=lea.next();
        System.out.print("Cantidad de horas trabajadas: ");
        int cantidadHoras=lea.nextInt();
        
        //Información de categorías 
        System.out.println("\n****Categorias****");
        System.out.println("Categroia 1 - $40 por hora extra");
        System.out.println("Categoria 2 - $50 por hora extra");
        System.out.println("Categoria 3 - $85 por hora extra");
        System.out.println("Categoria 4 -&0");
        System.out.println("Ingrese la categoria del trabajador");
        categoria=lea.nextInt();
       
        //Procedimiento  
        if (horasExtras<15) {
        horasExtras=(cantidadHoras-40);
        horasNormales=(cantidadHoras-horasExtras);
        }
        
        switch(categoria) {
            case 1:
                pagoHorasExtras=(horasExtras*40);
                break;
            case 2:
                pagoHorasExtras=(horasExtras*50);
                break;
            case 3:
                pagoHorasExtras=(horasExtras*85);
                break;
            case 4:
                pagoHorasExtras=(horasExtras*0);
                break;
            default:
                System.out.println("Categoría inválida");
                return;     
        }
        pagoTotal=((horasNormales*pagoNormal)+pagoHorasExtras);
         
        //Salida
        System.out.println("\n****Boleta Completa****");
        System.out.println("Codigo del empleado: "+codigo);
        System.out.println("Nombre completo del empleado: "+nombreCompleto);
        System.out.println("Cantidad de horas trabajadas: "+cantidadHoras);
        System.out.println("Categoria: "+categoria);
        System.out.println("Horas extras:" +horasExtras);
        System.out.println("Total a pagar: "+pagoTotal);
        }
    }

