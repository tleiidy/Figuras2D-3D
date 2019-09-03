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
public abstract class Figura3D implements Regla{
    double x, y, z;
    public double volumen;
    private Scanner teclado;
    Ejes punto1;
    Ejes punto2;
    Ejes punto3;
    
    /**
     * Contructor  de la clase
     */
    public Figura3D(){
        this.x = x;
        this.y = y;
        this.volumen = volumen;
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    /**
     * Contructor que inicializa las variables de la clase
     * @param punto1
     * @param punto2
     * @param punto3 
     */
    public Figura3D(Ejes punto1, Ejes punto2, Ejes punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
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

    /**
     * Retorna el valor del punto3
     * @return 
     */
    public Ejes getPunto3() {
        return punto3;
    }

    /**
     * Modifica el valor del punto3
     * @param punto3 
     */
    public void setPunto3(Ejes punto3) {
        this.punto3 = punto3;
    }
    
    
}
