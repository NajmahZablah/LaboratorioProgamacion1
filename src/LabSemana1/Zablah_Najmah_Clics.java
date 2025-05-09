/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSemana1;

/**
 *
 * @author najma
 */
public class Zablah_Najmah_Clics {
    public static void main(String[] args) {
        //Datos que conocemos 
        int clics030=60;
        int clics025=100;
        int clics080=20;
        
        double costo60clics=0.30;
        double costo100clics=0.25;
        double costo20clics=0.80;
        
        //Calcular el costo total
        double CostoTotal=(clics030*costo60clics)+(clics025*costo100clics)+(clics080*costo20clics);
        
        //Calcular el total de clics y el costo promedio
        int TotalClics=(clics030+clics025+clics080);
        double CostoPromedio=(CostoTotal/TotalClics);
        
        //Calcular el ISV (16%)
        double ISV=(CostoTotal*0.16);
        
        //Total con ISV
        double TotalConISV=(CostoTotal+ISV);
        
        //Salida
        System.out.println(String.format("Costo Total: "+CostoTotal));
        System.out.println(String.format("Costo promedio por clic: "+CostoPromedio));
        System.out.println(String.format("Total mas ISV: "+TotalConISV));
        
                
    }
}
