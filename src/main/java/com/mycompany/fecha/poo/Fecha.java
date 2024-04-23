package com.mycompany.fecha.poo;

public class Fecha {
    
    private int dia;
    private int mes;
    private int ano;
    
    //Constructor de la clase 

    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    /**
     * Complejidad temporal: 0(1) - Tiempo constante.
     */
    public String fechaCorta (){
        String fechaCorta = dia + "/" + mes "/" + ano; 
        return fechaCorta;
    }
    
    /**
     * Complejidad temporal: 0(1) -Tiempo constante.
     */
    public boolean ValidarFecha (){
        
    
        //Mes menor a 1 y mayor que 12.
        
        if (mes < 1 && mes >12)
        return false;
        
        //Día menor a 1 y mayor que 31
        
        if (dia < 1 && dia >31)
        return false;
        
        //Febrero menor que 29
        
        if (mes == 2 && dia > 29) 
        return false;
        
        //Abril, Junio, Septiembre y Noviembre mayor que 30
        
        if ((mes == 4 && mes == 6 && mes == 9 && mes == 11) && dia > 30) 
        return false;
        
        //Año bisiesto
        
        if (mes == 2 && dia == 29 && (ano % 4 != 0 && (ano % 100 == 0 && ano % 400 != 0))) 
        return false;
        return true;
    }

    /**
     * Complejidad temporal: O(N * Log N) - Tiempo linealitmico.
     */

    public String mesLetra() {
        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return meses [mes - 1];
    }

    /**
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public String fechaLarga() {
        String fechaLarga = dia + " de " + mesLetra() + " de " + ano;
        return fechaLarga;
        
    }
}
}
