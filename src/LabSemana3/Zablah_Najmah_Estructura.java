/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSemana3;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author najma
 */
public class Zablah_Najmah_Estructura {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in).useDelimiter("\\n");
        
        //Variables 
        int opcion;
        int contadorPalabraAlReves=0;
        int contadorNumeroPerfecto=0;
        int contadorNumeroPrimo=0;
        int contadorVotaciones=0;
        
        do {
            //Menú de entrada
            System.out.println("\n****Menu****");
            System.out.println("Opcion 1- Palabra Alreves");
            System.out.println("Opcion 2- Numero Perfecto");
            System.out.println("Opcion 3- Numero Primo");
            System.out.println("Opcion 4- Votaciones");
            System.out.println("Opcion 5- Salir");
            
            System.out.println("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            
            //Bloque de seleccion 
            switch (opcion) {
                    case 1:
                        //Opción 1- Palabra Alreves
                        contadorPalabraAlReves++;
                        System.out.print("Ingrese la cantidad de palabras: ");
                        int cantidadPalabras= scanner.nextInt();
                        
                        String palabraMasLarga="";
                        String palabraIngresada="";
                        
                        for (int i=0; i<cantidadPalabras; i++) {
                        System.out.print("ingrese una palabra: ");
                        String palabra=scanner.next();
                        palabraIngresada+=palabra+ "";
                        String palabraAlReves=new StringBuilder(palabra).reverse().toString();
                        System.out.println("La palabra al reves: "+palabraAlReves);
                        
                        //Verficar cuál palabra es la más larga
                        if (palabra.length()>palabraMasLarga.length()) {
                            palabraMasLarga=palabra;
                            }
                        }
                        System.out.println("La palabra mas larga es: "+palabraMasLarga);
                        
                        boolean palindromoEncontrado= false;
                        Scanner scannerPalabras= new Scanner(palabraIngresada);
                        while (scannerPalabras.hasNext()) {
                            String palabra= scannerPalabras.next();
                            String palabraAlReves=new StringBuilder(palabra).reverse().toString();
                            if (palabra.equalsIgnoreCase(palabraAlReves)) {
                              System.out.println("La palabra " +palabra+ " es un palindromo");
                              palindromoEncontrado= true;
                            }
                        }
                        if (!palindromoEncontrado) {
                            System.out.println("No se han encontrado palabras palindromas");
                        }
                        break;
            
                    case 2:
                    //Opción 2- Numero Perfecto
                    contadorNumeroPerfecto++;
                    System.out.print("Ingrese un numero para verificar si es perfecto: ");
                    int numeroPerfecto=scanner.nextInt();
                    
                    int sumaDivisores=0;
                    for (int i=1; i< numeroPerfecto; i++) {
                        if (numeroPerfecto%i==0) {
                        sumaDivisores+= i;
                        }
                    }
                    
                        if (sumaDivisores==numeroPerfecto) {
                    System.out.println(numeroPerfecto+ " es un numero perfecto");
                        } else {
                        System.out.println(numeroPerfecto+ " NO es un numero perfecto");
                        }
                    break;
        
                    case 3:
                        //Opción 3- Numero Primo
                        contadorNumeroPrimo++;
                        Random random= new Random();
                        int numeroAleatorio= random.nextInt(100)+1;
                        System.out.println("El numero aleatorio que se ha generado es: "+numeroAleatorio);
                        
                        int cantidadDivisores=0;
                        String divisores= "";
                        for (int i = 1; i <= numeroAleatorio; i++) {
                            if (numeroAleatorio%i==0) {
                                cantidadDivisores++;
                                divisores += i + "";
                            }
                        }
                        
                        if (cantidadDivisores==2) {
                            System.out.println("El numero " +numeroAleatorio+ " es primo porque solo tiene dos divisores");
                            } else {
                            System.out.println(numeroAleatorio+ " NO es un numero primo");
                            }
                        System.out.println("Divisores de "+numeroAleatorio+ " son: "+divisores);
                        break;
                        
                    case 4:
                        //Opción 4- Votaciones 
                        contadorVotaciones++;
                        System.out.print("Ingrese la cantidad de votantes en su pais: ");
                        int totalVotantes=scanner.nextInt();
                        
                        //Planillas a seleccionar
                        int votoAzul=0;
                        int votoRojo=0;
                        int votoNegro=0;
                        int votoAmarillo=0;
                        int votoNulo=0;
                        
                        for (int i=0; i < totalVotantes; i++) {
                          System.out.print("Ingrese el voto del votante "+(i+1)+ " (AZUL/ROJO/NEGRO/AMARILLO) ");
                          String voto= scanner.next().toUpperCase();
                        
                        switch (voto) {
                            case "AZUL":
                                votoAzul++;
                                break;
                            case "ROJO":
                                votoRojo++;
                                break;
                            case "NEGRO":
                                votoNegro++;
                                break;
                            case "AMARILLO":
                                votoAmarillo++;
                                break;
                            default:
                                System.out.println("Voto nulo");
                                votoNulo++;
                                break;
                            }
                        }
                        
                        int votosValidos=(votoAzul+votoRojo+votoNegro+votoAmarillo);
                        double porcentajeValido=(votosValidos/totalVotantes);
                        
                        //Planilla de votaciones 
                        System.out.println("\n****Resultados de la votacion****");
                        System.out.println("Votos por el AZUL: "+votoAzul);
                        System.out.println("Votos por el ROJO: "+votoRojo);
                        System.out.println("Votos por el NEGRO: "+votoNegro);
                        System.out.println("Votos por el AMARILLO: "+votoAmarillo);
                        System.out.println("Votos nulos: "+votoNulo);
                        System.out.println("Total de votos validos: "+votosValidos);
                        System.out.println("Porcentaje de votos validos: "+(porcentajeValido * 100)+"%");
                        
                        if (porcentajeValido >=0.60) {
                            int maxVotos=Math.max(votoAzul, Math.max(votoRojo, Math.max(votoNegro, votoAmarillo)));
                            String planillaGanadora= "";
                            if (maxVotos== votoAzul) planillaGanadora= "AZUL";
                            else if (maxVotos== votoRojo) planillaGanadora= "ROJO";
                            else if (maxVotos== votoNegro) planillaGanadora= "Negro";
                            else if (maxVotos== votoAmarillo) planillaGanadora= "AMARILLO";
                            
                            System.out.println("La planilla ganadora es la planilla "+planillaGanadora+ "!");
                            System.out.println("VOTACION VALIDA");
                            
                            } else {
                              System.out.println("VOTACION FALLIDA");
                            }   
                            break;
                            
                    case 5:
                        //Opcion 5- Salir
                        System.out.println("Saliendo del programa... tomara unos segundos...");
                        break;
                        
                    default:
                        System.out.println("Opcion NO valida. Por favor, seleccione una opcion del menu");
            }
        } while (opcion != 5);
        
        //CONTADOR: Mostrar la cantidad de veces que el usuario ha ingresado a cada opcion
        System.out.println("\n****Estadisticas de uso del menu****");
        System.out.println("Opcion 1- (Palabra Alreves) se ha ingresado "+contadorPalabraAlReves+ " veces");
        System.out.println("Opcion 2- (Numero Perfecto) se ha ingreado "+contadorNumeroPerfecto+ " veces");
        System.out.println("Opcion 3- (Numero Primo) se ha ingresado "+contadorNumeroPrimo+ " veces");
        System.out.println("Opcion 4- (Votaciones) se ha ingresado "+contadorVotaciones+ " veces");
    }
}