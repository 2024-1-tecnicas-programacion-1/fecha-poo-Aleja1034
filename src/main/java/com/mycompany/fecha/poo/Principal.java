package com.mycompany.Fecha.poo;
import java.util.Scanner; 
    
public class Principal {
    
{
    /**
     * Complejidad temporal: O(N) - Tiempo lineal.
     */
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el día:");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año:");
        int ano = sc.nextInt();

        Fecha fecha = new Fecha(dia, mes, ano);
        if (Fecha.validarFecha()) {
            System.out.println("La fecha es válida.");
            System.out.println("Fecha corta: " + fecha.fechaCorta());
            System.out.println("Fecha larga: " + fecha.fechaLarga());
        } else {
            System.out.println("Fecha no válida.");
        }
    }
    
}
}
