/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejercicioherencia.geometria;

import java.util.Scanner;

/**
 *
 * @author Leidy Torres
 */
public abstract class Figura2D implements Regla{
    
    public double perimetro;
    double x, y;
    Ejes punto1;
    Ejes punto2;
    private Scanner teclado;

    /**
     * Contructor de la clase que inicializa las variables
     * @param punto1
     * @param punto2 
     */
    public Figura2D(Ejes punto1, Ejes punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    /**
     * Contructor de la clase
     */
    public Figura2D() {
        this.perimetro = perimetro;
        this.x = x;
        this.y = y;
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    /**
     * Metodo implementado de la interface
     */
    @Override
    public void imprimirResultados(){
    
    }
    

    /**
     * Retorna el valor del punto1
     * @return 
     */
    public Ejes getPunto1() {
        return punto1;
    }

    /**
     * Modifica el valor del punto1
     * @param punto1 
     */
    public void setPunto1(Ejes punto1) {
        this.punto1 = punto1;
    }

    /**
     * Retorna el valor del punto2
     * @return 
     */
    public Ejes getPunto2() {
        return punto2;
    }

    /**
     * Modifica el valor del punto2
     * @param punto2 
     */
    public void setPunto2(Ejes punto2) {
        this.punto2 = punto2;
    }

}
