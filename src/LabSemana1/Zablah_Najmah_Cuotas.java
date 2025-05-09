/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSemana1;

import java.util.Scanner;

/**
 *
 * @author najma
 */
public class Zablah_Najmah_Cuotas {
     public static void main(String[] args) {
         //El usuario debe ingresar los siguientes datos
         Scanner scanner=new Scanner(System.in);
         
         System.out.print("Ingresar el monto del prestamo: HNL.");
         double MontoPrestamo=scanner.nextDouble();
         
         System.out.print("Ingresar el plazo en meses: ");
         int PlazoMensual=scanner.nextInt();
         
         //Conversión
         System.out.print("Ingresar la tasa de interes mensual: %");
         int TasaInteresMensual=scanner.nextInt();
          double PorcentajeDecimalTIM=(TasaInteresMensual/100);
         
         System.out.print("Ingresar comision fija por cuota: HNL.");
         double ComisionFija=scanner.nextDouble();
        
         //Conversión
         System.out.print("Ingresar el porcentaje del seguro de la cuota: %");
         int SeguroCuota=scanner.nextInt();
         double PorcentajeSC=(SeguroCuota/100);
         
         double InteresTotal=(MontoPrestamo*PlazoMensual*PorcentajeDecimalTIM);
         double MontoTotalBase=(MontoPrestamo+InteresTotal);
         double CuotaBase=(MontoTotalBase/PlazoMensual);
         double Seguro=(CuotaBase*PorcentajeSC);
         
         double CuotaTotal=(CuotaBase+ComisionFija+Seguro);
         double TotalPagar=(CuotaTotal*PlazoMensual);
         
         //Salida
         System.out.println("\n****Cuotas Mensuales****");
         System.out.println("Cuota de Pago Mensual: HNL."+CuotaTotal);
         System.out.println("Total a Pagar: HNL."+TotalPagar);
     }
}
